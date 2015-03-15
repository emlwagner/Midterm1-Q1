package test1Q1;

public class Staff extends Employee {
	private String title;
	
	public Staff() {
		}
	
	public Staff(String title) {
		this.title = title;
	}
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "The class is Staff, and the staff member's name is " + Staff.getName();
	}
	

}
