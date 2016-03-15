package pl.lodz.usos;

public class StudentNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	public StudentNotFoundException() {
	}

	@Override
	public String getMessage() {
		return "Nie ma takiego studenta na liœcie";
	}

}
