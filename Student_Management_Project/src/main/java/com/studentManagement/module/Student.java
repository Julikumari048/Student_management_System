package com.studentManagement.module;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@jakarta.persistence.Entity
public class Student {
	
	@jakarta.persistence.Id
	@jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.AUTO)
	private Integer studentId;
	private String name;
	private String fatherName;
	private String email;
	private String mobileNumber;
	private LocalDate dob;
	private String gender;
	

	@jakarta.persistence.OneToMany(cascade = jakarta.persistence.CascadeType.ALL)
	private List<Address> address = new ArrayList<>();
	

	@jakarta.persistence.ManyToMany(cascade = jakarta.persistence.CascadeType.ALL,mappedBy = "students")
	List<Course> courses = new ArrayList<>();

	
}
