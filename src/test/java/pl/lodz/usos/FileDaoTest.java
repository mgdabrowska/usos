package pl.lodz.usos;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by stawicad on 2016-03-01.
 */
public class FileDaoTest {

    private String absolutePath;
    private FileDao fileDao;

    @Before
    public void setUp() throws IOException {
        absolutePath = File.createTempFile("filedao", "test").getAbsolutePath();
        fileDao = new FileDao(absolutePath);
    }

    @Test
    public void simpleTest() {
        //given
        Student stas = new Student("123", "Stas", "Nowak");

        //when
        boolean added = fileDao.addStudent(stas);

        //then
        assertTrue("Student should have been added properly", added);
        assertTrue(fileDao.getAllStudents().size() == 1);
    }
}
