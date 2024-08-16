package edu.kec.sms;

import java.util.Scanner;
import edu.kec.sms.iservice.IStudentService;
import edu.kec.sms.model.Student;
import edu.kec.sms.service.StudentService;

public class Main {

	public static void main(String[] args) {
		IStudentService studentService = new StudentService();
		Student student = new Student();
		studentService.add(student);
	}

	public static Student readStudent() {
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		System.out.println("Enter the name:");
		student.setName(scanner.next());
		System.out.println("Enter email:");
		student.setEmail(scanner.nextLine());
		System.out.println("enter id:");
		student.setId(scanner.nextInt());
		System.out.println("Enter mobile number:");
		student.setMobile(scanner.nextLong());
		scanner.close();
		return student;
	}

}
