package pl.lodz.usos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileStudentDao implements StudentDao {

	private File file;

	public FileStudentDao(String plik) {
		//file = new File(plik);
		try {
   		 
		       file = new File(plik);
		      
		      if (file.createNewFile()){
		        System.out.println("File is created!");
		      }else{
		        System.out.println("File already exists.");
		      }
		      
	    	} catch (IOException e) {
		      e.printStackTrace();
		}
	}

	public List<Student> getAllStudents() throws FileNotFoundException {
		Scanner in = new Scanner(file);
		List<Student> result = new ArrayList<Student>();
		while (in.hasNextLine()) {
			String read = in.nextLine();
			String[] a = read.split(";");
			result.add(new Student(a[0], a[1], a[2]));

		}
		in.close();
		return result;
	}

	public boolean  addNewStudent(Student s) throws IOException {
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				file, true)));
		out.println(s.index + ";" + s.getFirstName() + ";" + s.getLastName());
		out.close();
		return true;
	}

	public Student removeStudent(String index) throws IOException {
		List<Student> allStudents = getAllStudents();
		// file.delete();
		PrintWriter out = new PrintWriter(file);
		for (int i = 0; i < allStudents.size(); i++) {
			if (!allStudents.get(i).index.equals(index)) {
				// addStudent(getAllStudents().get(i));
				Student s = allStudents.get(i);
				out.println(s.index + ";" + s.getFirstName() + ";"
						+ s.getLastName());
			}
		}
		out.close();
		return null;
	}

	public Student getStudent(String index) throws FileNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean addStudent(Student s) throws FileNotFoundException,
			IOException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean exist(Student student) throws FileNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}
		
	
	

	
}
