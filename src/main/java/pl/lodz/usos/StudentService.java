package pl.lodz.usos;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by stawicad on 2016-02-10.
 */
public class StudentService {
	
	//private List<Student> students = new ArrayList<Student>();
	private FileDao dao = new FileDao("baza.txt");

    public boolean addNewStudent(Student s) throws FileNotFoundException {
    	dao.addStudent(s);
        return true;
    }

    public List<Student> getAllStudents() throws FileNotFoundException {
    	
        return dao.getAllStudents();
    }

    public Student getStudent(String index) throws FileNotFoundException {
    	List<Student> allStudents = dao.getAllStudents();
		for (int i = 0; i < allStudents.size(); i++) {
			if(allStudents.get(i).index.equals(index)){
				return allStudents.get(i);
			}
		}
        return null;
    }
}
