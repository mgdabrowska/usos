package pl.lodz.usos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileStudentDao implements StudentDao {

	private File file;

	public FileStudentDao(String plik) {

		file = new File(plik);
	}

	public List<Student> getAllStudents() throws FileNotFoundException {
		Scanner in = new Scanner(file);
		List<Student> result = new ArrayList<Student>();
		while (in.hasNextLine()) {
			String read = in.nextLine();
			String[] a = read.split(";");
			result.add(new Student(a[0], a[1], a[2]));

		}
		return result;
	}

	public boolean addStudent(Student s) throws FileNotFoundException {
		PrintWriter out = new PrintWriter(file);
		out.println(s.index + ";" + s.getFirstName() + ";" + s.getLastName());
		out.close();
		return true;
	}

	public Student removeStudent(String index) throws FileNotFoundException {
		getAllStudents();
		for (int i = 0; i < getAllStudents().size(); i++) {
			if (getAllStudents().get(i).index.equals(index)) {
				return getAllStudents().remove(i);
			}
			//return null;
			file.delete();
			addStudent(getAllStudents().remove(i));
		}
		return null;
	}

	public Student getStudent(String index) throws FileNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
}
