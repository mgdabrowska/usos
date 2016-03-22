package pl.lodz.usos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by stawicad on 2016-03-21.
 */
public class PostgresStudentDao implements StudentDao {
    public List<Student> getAllStudents() throws FileNotFoundException {
        final ArrayList<Student> students = new ArrayList<Student>();
        try {
            final Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/app", "postgres", "hasL0");
            final Statement statement = connection.createStatement();
            final ResultSet resultSet = statement.executeQuery("select * from usos.student;");

            while (resultSet.next()) {
                students.add(new Student(resultSet.getString("index"), resultSet.getString("first_name"), resultSet.getString("last_name")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }

    public boolean addStudent(final Student s) throws FileNotFoundException, IOException {
        return false;
    }

    public Student getStudent(final String index) throws FileNotFoundException {
        return null;
    }

    public Student removeStudent(final String index) throws FileNotFoundException, IOException {
        return null;
    }

    public boolean exist(final String student) throws FileNotFoundException {
        return false;
    }
}
