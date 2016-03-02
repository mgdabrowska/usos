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
	
	public String toString(){
		return index +";"+ firstName+ ";"+ lastName;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((index == null) ? 0 : index.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (index == null) {
			if (other.index != null)
				return false;
		} else if (!index.equals(other.index))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}
	
	
}
