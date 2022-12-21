package com.studentManagement.service;



import com.studentManagement.exception.StudentException;
import com.studentManagement.module.Student;
import com.studentManagement.module.dto.StudentDTO;

public interface StudentService {
	
	public Student registerStudent(Student student) throws StudentException;

	

}
