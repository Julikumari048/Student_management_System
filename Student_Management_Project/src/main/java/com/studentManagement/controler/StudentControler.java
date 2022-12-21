package com.studentManagement.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.studentManagement.exception.StudentException;
import com.studentManagement.module.Student;
import com.studentManagement.module.dto.StudentDTO;
import com.studentManagement.service.StudentService;

import jakarta.validation.Valid;

@RestController
public class StudentControler {
         
	@Autowired    //(required = false)
	  private StudentService studentService;
	
	@PostMapping("student/register")
	  public ResponseEntity<Student> studentRegisterHandler(@Valid @RequestBody Student student) throws StudentException{
		  
		      Student studentRegister= studentService.registerStudent(student);
		      
		      return new ResponseEntity<Student>(student, HttpStatus.OK);
	  }
}
