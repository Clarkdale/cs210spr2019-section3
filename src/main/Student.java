package main;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String firstName;
	private String lastName;
	private int idNumber;
	private List<Class> enrolled;
	private Transcript transcript;
	
	public Student(String first, String last, int id) {
		this.setFirstName(first);
		this.setLastName(last);
		this.setIdNumber(id);
		this.setEnrolled(new ArrayList<>());
		this.setTranscript(new Transcript());
	}
	
	public Student(String first, String last, int id, Transcript transfer) {
		this.setFirstName(first);
		this.setLastName(last);
		this.setIdNumber(id);
		this.setEnrolled(new ArrayList<>());
		this.setTranscript(transfer);
	}
	
	public void addClass(Class in) {
		this.enrolled.add(in);
	}
	
	public void dropClass(Class in) {
		for (int i = 0; i < enrolled.size(); i++) {
			if (enrolled.get(i).equals(in)) {
				enrolled.remove(i);
			}
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public List<Class> getEnrolled() {
		return enrolled;
	}

	public void setEnrolled(List<Class> courses) {
		this.enrolled = courses;
	}

	public Transcript getTranscript() {
		return transcript;
	}

	public void setTranscript(Transcript transcript) {
		this.transcript = transcript;
	}
	
	public String toString() {
		return this.firstName + this.lastName;
	}
}
