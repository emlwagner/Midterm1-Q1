package test1Q1;

public enum eStatus {
	
	Freshman(1),
	Sophmore(2),
	Junior(3),
	Senior(4);
	
	private int status;
	
	private eStatus(final int status) {
		this.status = status;
	}
	
	public int getStatus() {
		return this.status;
	}

}
