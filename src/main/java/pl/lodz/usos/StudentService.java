package pl.lodz.usos;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by stawicad on 2016-02-10.
 */
public class StudentService {
	
	private List<Student> students = new ArrayList<Student>();

    public boolean addNewStudent(Student s) {
    	students.add(s);
        return true;
    }

    public List<Student> getAllStudents() {
    	
        return students;
    }

    public Student getStudent(String index) {
    	for (int i = 0; i < students.size(); i++) {
			if(students.get(i).index.equals(index)){
				return students.get(i);
			}
		}
        return null;
    }
}
