package com.tts.day2;

import java.util.*;

public class Student extends Person{
	int gradYear;
	boolean enrolled = false;
	
	void enrolledStudent() {
		enrolled = true;
	}
	
	static Student addStudents(String name, int age, int gradYear, boolean enrolled) {
		Student new_student = new Student();
		new_student.name = name;
		new_student.age = age;
		new_student.gradYear = gradYear;
		new_student.enrolled = enrolled;
		return new_student;
		
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> studentList = new ArrayList<>();
		String studentName;
		int studentAge;
		int studentGradYear;
		boolean enrollmentStatus;
		String complete = "no";
		
		while(complete.equals("no")) {
			System.out.println("Enter a name: ");
			studentName = sc.nextLine();
			System.out.println("Enter age: ");
			studentAge = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the year you graduated: ");
			studentGradYear = sc.nextInt();
			sc.nextLine();
			System.out.println("Are you currently enrolled (Enter true or false): ");
			enrollmentStatus = sc.nextBoolean();
			sc.nextLine();
			studentList.add(addStudents(studentName, studentAge, studentGradYear, enrollmentStatus));
			System.out.println("Is your list complete (enter yes or no): ");
			complete = sc.nextLine();
		}
		
		
		for (Student s : studentList) {
		System.out.println("Student " + (studentList.indexOf(s) + 1) + "\nName:\t\t\t" + s.name + "\nAge:\t\t\t" 
				+ s.age + "\nGraduation Year:\t" + s.gradYear + "\nEnrolled?\t\t"
				+ s.enrolled + "\n");
		}
	}
}
