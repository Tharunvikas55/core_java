package edu.kec.sms.service;

import edu.kec.sms.iservice.IStudentService;
import edu.kec.sms.model.Student;

public class StudentService implements IStudentService {
	Student[] studentList = new Student[10];
	private static Integer index = 0;

	@Override
	public boolean add(Student student) {
		studentList[index] = student;
		index++;
		return true;
	}

	@Override
	public Student getStudentById(Integer id) {
		Student student = new Student();
		for (Student std : studentList)
			if (std.getId() == id) {
				student = std;
				break;
			}
		return student;
	}
}
