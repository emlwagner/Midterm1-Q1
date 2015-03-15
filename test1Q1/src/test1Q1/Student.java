package test1Q1;

public class Student extends Person {
	final String status = "freshman";
	
	public Student() {
	}

	public String getStatus() {
		return status;
	}
	
	@Override
	public String toString() {
		return "The class is Student, and the student's name is " + super.getName();
	}
	

}
