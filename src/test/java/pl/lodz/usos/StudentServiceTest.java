package pl.lodz.usos;



import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by stawicad on 2016-02-10.
 */
public class StudentServiceTest {

    private StudentService studentService = new StudentService();

    @Test
    public void simpleTest() {
        //given
        Student stas = new Student("123", "Stas", "Nowak");

        //when
        boolean added = studentService.addNewStudent(stas);

        //then
        assertTrue("Student should have been added properly", added);
        assertTrue(studentService.getAllStudents().size() == 1);
        assertThat(studentService.getStudent("123"), is(stas));
    }
}
