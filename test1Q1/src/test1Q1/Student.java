package test1Q1;

public class Student extends Person {
	
	private eStatus status;
	
	public Student() {
	}
	
	public Student(int year) {
		year--;
		this.status = eStatus.values()[year];
	}

	public eStatus getStatus() {
		return status;
	}
	
	@Override
	public String toString() {
		return "The class is Student, and the student's name is " + super.getName();
	}
	
}
