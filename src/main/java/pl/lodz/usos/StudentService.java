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

	public List<Student> getAllStudents() throws FileNotFoundException, StudentNotFoundException {
		List<Student> student =  dao.getAllStudents();
		if( student == null ){
			throw new StudentNotFoundException();
		}
		return dao.getAllStudents();
	}

	public Student getStudent(String index) throws FileNotFoundException, StudentNotFoundException {
		List<Student> allStudents = dao.getAllStudents();
		int i =0;
		Student student = allStudents.get(i);
		if( student == null ){
			throw new StudentNotFoundException();
		}
		for ( i = 0; i < allStudents.size(); i++) {
			if (allStudents.get(i).index.equals(index)) {
				return student;
			}
		}
		return null;
	
	}

	public Student removeStudent(String index) throws IOException, StudentNotFoundException {
				Student student = dao.removeStudent(index);
			if(student == null){
				throw new StudentNotFoundException();
			}
		return null;

	}
}
