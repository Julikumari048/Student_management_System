package com.studentManagement.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.studentManagement.module.Course;

public interface CourseDAO extends JpaRepository<Course, Integer>{
	
	@Query("from Course C where C.topics LIKE %:topic% OR C.courseName LIKE %:topic% ")
	   public List<Course> getCoursesByTopic(String topic) ;

}
