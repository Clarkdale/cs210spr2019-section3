package main;

import java.util.ArrayList;
import java.util.List;

public class Student {
	public String first_name;
	public String last_name;
	public int id_number;
	public ArrayList<Class> enrolled;
	public Transcript transcript;
	
	public Student(String first, String last, int id) {
		this.first_name = first;
		this.last_name = last;
		this.id_number = id;
		this.enrolled = new ArrayList<>();
		this.transcript = new Transcript();
	}
	
	public Student(String first, String last, int id) {
		this.first_name = first;
		this.last_name = last;
		this.id_number = id;
		this.enrolled = new ArrayList<>();
		this.transcript = new Transcript();
	}
	
	public String toString() {
		return this.first_name + this.last_name;
	}
}
