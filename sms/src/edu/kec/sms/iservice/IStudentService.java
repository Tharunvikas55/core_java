package edu.kec.sms.iservice;

import edu.kec.sms.model.Student;

public interface IStudentService {

	public boolean add(Student student);

	public Student getStudentById(Integer id);
}
