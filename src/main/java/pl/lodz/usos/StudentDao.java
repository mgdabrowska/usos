package pl.lodz.usos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface StudentDao {
	public List<Student> getAllStudents() throws FileNotFoundException;

	public boolean addStudent(Student s) throws FileNotFoundException,
			IOException;

	public Student getStudent(String index) throws FileNotFoundException;

	public Student removeStudent(String index) throws FileNotFoundException,
			IOException;

}
