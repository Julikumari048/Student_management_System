package com.studentManagement.service;

import java.util.List;

import com.studentManagement.exception.CourseException;
import com.studentManagement.exception.LoginException;
import com.studentManagement.exception.StudentException;
import com.studentManagement.module.Admin;
import com.studentManagement.module.Course;
import com.studentManagement.module.Student;
import com.studentManagement.module.dto.AdminDTO;
import com.studentManagement.module.dto.CourseDTO;
import com.studentManagement.module.dto.CourseStudent;
import com.studentManagement.module.dto.StudentCourseDTO;

public interface AdminService {
	
	public Admin adminRegister(Admin admin);

	public Course addCourse(Course course, String key) throws CourseException, LoginException;
	
	public StudentCourseDTO assignCourseToStudent(Integer studentId,Integer courseId, String key) throws CourseException, StudentException, LoginException;
	
   public Student getStudentById(Integer studentId) throws StudentException ;

	public List<Course> getAllCoursesAdminPurpose(Integer studentId) throws StudentException ;
	
	
	public StudentCourseDTO coursesToStudentCourse(List<Course> courses,Student student) ;
	
	  public List<Student> getStudentByName(String name, String key) throws StudentException, LoginException;
	  
	  public CourseStudent getStudentsFromCourse(Integer courseId, String key) throws CourseException;

}
