package pl.lodz.usos;

/**
 * Created by stawicad on 2016-02-10.
 */
public class Student {

    String index;
    private String firstName;
    private String lastName;


    public Student(String index, String firstName, String lastName) {
        this.index = index;
        this.firstName = firstName;
        this.lastName = lastName;
    }


	public String getIndex() {
		return index;
	}
}
