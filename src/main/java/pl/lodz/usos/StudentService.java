package pl.lodz.usos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by stawicad on 2016-02-10.
 */
public class StudentService {

	// private List<Student> students = new ArrayList<Student>();

	private FileStudentDao dao = new FileStudentDao("baza.txt");

	public boolean addNewStudent(Student s) throws IOException {
		dao.addStudent(s);
		return true;
	}

	public List<Student> getAllStudents() throws FileNotFoundException,
			StudentNotFoundException {
		List<Student> students = dao.getAllStudents();
		//Student student = null;
		//if (!dao.exist(student)) {
		//	throw new StudentNotFoundException();
		//}

		return dao.getAllStudents();
	}

	public Student getStudent(String index) throws FileNotFoundException,
			StudentNotFoundException {
		List<Student> allStudents = dao.getAllStudents();
		//Student student = null;
		if (!dao.exist(index)) {
			throw new StudentNotFoundException();
		}
		for (int i = 0; i < allStudents.size(); i++) {
			if (allStudents.get(i).index.equals(index)) {
				return allStudents.get(i);
			}
		}
		return null;

	}

	public Student removeStudent(String index) throws IOException,
			StudentNotFoundException {
		
		//String student= null;
		if (!dao.exist(index)) {
			throw new StudentNotFoundException();
		}
		 return dao.removeStudent(index);

		//return null;

	}
}
