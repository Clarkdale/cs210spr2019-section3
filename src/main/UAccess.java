package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UAccess {
	public static void main(String [] args) {
		Map<String, Student> students = new HashMap<>();
		Map<String, Class> classes = new HashMap<>();
		
		Class cs110 = new Class("CSC", "Intro to Computer Programming 1", 4, 110, 100, "Ben Dicken");
		Class cs120 = new Class("CSC", "Intro to Computer Programming 2", 4, 120, 100, "Janalee O'bagy");
		Class cs210 = new Class("CSC", "Software Development", 4, 210, 100, "Tyler Conklin");
		Class cs245 = new Class("CSC", "Intro to Discrete Structures", 4, 245, 100, "Lester McCann");
		
		classes.put("CSC " + cs110.getNumber(), cs110);
		classes.put("CSC " + cs120.getNumber(), cs120);
		classes.put("CSC " + cs245.getNumber(), cs245);
		classes.put("CSC " + cs210.getNumber(), cs210);
		
		int idCounter = students.keySet().size();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Hello, welcome to UAccess! What is your name(first last)? ");
		
		String name = input.nextLine();
		
		Student current;
		
		if (students.containsKey(name)) {
			current = students.get(name);
		} else {
			String [] firstLast = name.split("\\s+");
			System.out.println(firstLast[1]);
			current = new Student(firstLast[0], firstLast[1], idCounter);
			idCounter++;
			
			students.put(name, current);
		}
		
		String decision = "";
		while (!decision.equals("exit")) {
			System.out.println("Input Key");
			System.out.println("'courses': List Courses");
			System.out.println("'transcript': show transcript");
			System.out.println("'add': add a course");
			System.out.println("'drop': drop a course");
			System.out.println("'exit': exit program");
			System.out.print("\nWhat would you like to do next? ");
			decision = input.nextLine().toLowerCase();
			
			if (decision.equals("courses")) {
				for (String each : classes.keySet()) {
					System.out.println(classes.get(each).toString());
				}
			} else if (decision.equals("transcript")) {
				System.out.println(current.getTranscript().toString());
			} else if (decision.equals("add")) {
				System.out.print("Which class? ");
				String val = input.nextLine();
				System.out.println(val);
				if (classes.containsKey(val)) {
					current.addClass(classes.get(val));
					System.out.println("Successful");
				} else {
					System.out.println("Course not available");
				}
				
			} else if (decision.equals("drop")) {
				System.out.print("Which class? ");
				String val = input.nextLine();
				
				current.dropClass(classes.get(val));
			} else if (!decision.equals("exit")) {
				System.out.println("Unrecognized Command.");
			}
		}
		
		System.out.println("Logged out of UAuth Successfully");
	}
}
