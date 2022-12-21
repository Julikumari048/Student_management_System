package com.studentManagement.module.dto;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.studentManagement.module.Address;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
 public class StudentDTO {
	 
	private Integer studentId;
	
	@jakarta.validation.constraints.NotNull(message = "name can't be Null")
	@jakarta.validation.constraints.NotBlank(message = "name can't be blank")
	@jakarta.validation.constraints.NotEmpty(message = "name can't be empty")
	private String name;
	
	@jakarta.validation.constraints.NotNull(message = "name of father can't be Null")
	@jakarta.validation.constraints.NotBlank(message = "name of father can't be blank")
	@jakarta.validation.constraints.NotEmpty(message = "name of father can't be empty")
	private String fatherName;
	
	@jakarta.validation.constraints.Email(message = "Please enter valid an emailId")
	private String email;
	
	@jakarta.validation.constraints.Pattern(regexp = "[6789][0-9]{9}",message = "Mobile number should start with 6-9 and of size 10")
	private String mobileNumber;
	
	private LocalDate dob;
	
	@jakarta.validation.constraints.NotNull(message = "gender cannot be Null")
	private Gender gender;
	
	private List<Address> address= new ArrayList<>();

}
