package pl.lodz.usos;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by stawicad on 2016-02-10.
 */
public class ConsoleApplications {

	public static void main(String[] args) throws FileNotFoundException {

		StudentService ss = new StudentService();

		while (true) {
			System.out.println("");
			System.out.println("1 - add the students");
			System.out.println("2 - show all students");
			System.out.println("3 - wyszukaj studenta po indeksie");
			System.out.println("4 - stop");

			Scanner sc = new Scanner(System.in);
			System.out.println("give the number");
			String a = sc.nextLine();
			if ("1".equals(a)) {
				System.out.println("give the name");
				String name = sc.nextLine();
				System.out.println("give the surname");
				String surname = sc.nextLine();
				System.out.println("give the index");
				String index = sc.nextLine();

				ss.addNewStudent(new Student(index, name, surname));
			}
			if ("2".equals(a)) {
				System.out.println(""+ss.getAllStudents()+"");
			}
			if("3".equals(a)){
				System.out.println("give the index");
				String index = sc.nextLine();
				System.out.println(ss.getStudent(index));
			}
			if("4".equals(a)){
				break;
			}
		}
	}

}
