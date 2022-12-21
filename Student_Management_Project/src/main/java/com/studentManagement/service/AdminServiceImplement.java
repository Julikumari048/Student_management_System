package com.studentManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentManagement.exception.CourseException;
import com.studentManagement.exception.LoginException;
import com.studentManagement.exception.StudentException;
import com.studentManagement.module.Admin;
import com.studentManagement.module.AdminLoginSession;
import com.studentManagement.module.Course;
import com.studentManagement.module.Student;
import com.studentManagement.module.dto.CourseDTO;
import com.studentManagement.module.dto.CourseStudent;
import com.studentManagement.module.dto.StudentCourseDTO;
import com.studentManagement.module.dto.StudentDTO;
import com.studentManagement.repo.AdminDAO;
import com.studentManagement.repo.CourseDAO;
import com.studentManagement.repo.LoginSessionDAO;
import com.studentManagement.repo.StudentDAO;

@Service
public class AdminServiceImplement implements AdminService {
	
	@Autowired
	  private AdminDAO adminDao;
	
	@Autowired
	private LoginSessionDAO loginSessionDao;
	
	@Autowired
	private StudentDAO studentDao;
	
	@Autowired
	private CourseDAO courseDao;
	
	@Autowired
	private StudentService studentService;
	
	
	  
	@Override
	public Admin adminRegister(Admin admin) {
		
		          Admin saveAdmin= adminDao.save(admin);
		          
		          return saveAdmin;
	}

	@Override
	public Course addCourse(Course course, String key) throws CourseException, LoginException {
		
		Optional<AdminLoginSession> adminLoginSession= loginSessionDao.findByUuid(key);
        if(adminLoginSession.isEmpty())
	     {
	    	 throw new LoginException("Unathrosied access denied.");
	     }
        
           Course courseSave= courseDao.save(course);
           
           return courseSave;
           
	}

	@Override
	public StudentCourseDTO assignCourseToStudent(Integer studentId, Integer courseId, String key)
			throws CourseException, StudentException, LoginException {
		
		Optional<AdminLoginSession> adminLoginSession= loginSessionDao.findByUuid(key);
        if(adminLoginSession.isEmpty())
	     {
	    	 throw new LoginException("Unathrosied access denied.");
	     }
		
		Course course =  courseDao.findById(courseId).orElseThrow(()-> new CourseException("Invalid CourseId "+ courseId)) ;
		Student student = studentDao.getById(studentId);
				
		course.getStudents().add(student);
		Course updatedCourseDetails = courseDao.save(course);
		
		List<Course> studentCourses = getAllCoursesAdminPurpose(studentId) ;
		
		StudentCourseDTO studentCourseDetails = coursesToStudentCourse(studentCourses, student);
		
		   return studentCourseDetails;
	}

	@Override
	public Student getStudentById(Integer studentId) throws StudentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> getAllCoursesAdminPurpose(Integer studentId) throws StudentException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public StudentCourseDTO coursesToStudentCourse(List<Course> courses, Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getStudentByName(String name, String key) throws LoginException, StudentException {
		
		Optional<AdminLoginSession> adminLoginSession= loginSessionDao.findByUuid(key);
        if(adminLoginSession.isEmpty())
	     {
	    	 throw new LoginException("Unathrosied access denied.");
	     }
        
           List<Student>  student= studentDao.getStudentsByName(name);
           
           if(student.isEmpty())
           {
        	    throw new StudentException("Student not found..");
           }
		    return student;
	}

	@Override
	public CourseStudent getStudentsFromCourse(Integer courseId, String key) throws CourseException {
		// TODO Auto-generated method stub
		return null;
	}

	

}