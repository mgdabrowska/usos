package pl.lodz.usos;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import java.io.File;
import java.io.IOException;

/**
 * Created by stawicad on 2016-03-01.
 */
public class FileDaoTest {

    private String absolutePath;
    private StudentDao fileDao;

    @Before
    public void setUp() throws IOException {
        absolutePath = File.createTempFile("filedao", "test").getAbsolutePath();
        fileDao = new FileStudentDao(absolutePath);
    }

    @Test
    public void simpleTest() throws IOException {
        //given
        Student stas = new Student("123", "Stas", "Nowak");

        //when
        boolean added = fileDao.addStudent(stas);

        //then
        assertTrue("Student should have been added properly", added);
        assertTrue(fileDao.getAllStudents().size() == 1);
    }
}
