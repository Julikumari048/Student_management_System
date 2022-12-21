package com.studentManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentManagement.exception.StudentException;
import com.studentManagement.module.Student;
import com.studentManagement.module.dto.StudentDTO;
import com.studentManagement.repo.AddressDAO;
import com.studentManagement.repo.CourseDAO;
import com.studentManagement.repo.LoginSessionDAO;
import com.studentManagement.repo.StudentDAO;


@Service
public class StudentServiceImplement implements StudentService{

	   @Autowired
       private StudentDAO  studentDao;
	   
	   @Autowired
	   private CourseDAO courseDao;
	   
	   @Autowired
	   private AddressDAO addressDao;
	   
	   @Autowired
	   private LoginSessionDAO loginSessionDao;
	   
	 	   
	@Override
	public Student registerStudent(Student student) throws StudentException {
		   
		return studentDao.save(student);
		
		    
		          
	}
	


}
