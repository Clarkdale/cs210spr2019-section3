package main;

public class Class {
	private String dept;
	private String className;
	private int credits;
	private int number;
	private String staff;
	private int capacity;
	private int enrolled;
	
	public Class(String department, String name, int numCredits, int courseNumber, int cap) {
		this.setDepartment(department);
		this.setClassName(name);
		this.setCredits(numCredits);
		this.setNumber(courseNumber);
		this.setStaff("TBD");
		this.setCapacity(cap);
		this.setEnrolled(0);
	}
	
	public Class(String department, String name, int numCredits, int courseNumber, int cap, String faculty) {
		this.setDepartment(department);
		this.setClassName(name);
		this.setCredits(numCredits);
		this.setNumber(courseNumber);
		this.setStaff(faculty);
		this.setCapacity(cap);
		this.setEnrolled(0);
	}

	
	public boolean open() {
		return enrolled < capacity;
	}
	
	public void enroll() {
		this.enrolled++;
	}

	public String getDepartment() {
		return dept;
	}

	public void setDepartment(String dept) {
		this.dept = dept;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public String getStaff() {
		return staff;
	}

	public void setStaff(String staff) {
		this.staff = staff;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getEnrolled() {
		return enrolled;
	}

	public void setEnrolled(int enrolled) {
		this.enrolled = enrolled;
	}

	public boolean equals(Class other) {
		if (other.getDepartment().equals(this.dept) && other.getNumber() == this.number) {
			return true;
		} else {
			return false;
		}
	}
}
