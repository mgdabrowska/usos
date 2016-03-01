package pl.lodz.usos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class FileDao implements StudentDao {

	private File file;

	public FileDao(String plik) {

		file = new File(plik);
	}

	public List<Student> getAllStudents() throws FileNotFoundException {
		Scanner in = new Scanner(file);
		while(in.hasNextLine()){
			String read = in.nextLine();
			read.split(";");
			getAllStudents().add(new Student(read, read,read));
			
			
		}
		return null;
	}

	public boolean addStudent(Student s) throws FileNotFoundException {
		new PrintWriter(file);
		
		return true;
	}

	public Student getStudent(String index) {
		// TODO Auto-generated method stub
		return null;
	}
}
