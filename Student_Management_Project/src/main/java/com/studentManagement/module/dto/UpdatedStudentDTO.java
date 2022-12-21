package com.studentManagement.module.dto;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdatedStudentDTO {
	
	private Integer studentId;
	private LocalDate dob;
	
	@jakarta.validation.constraints.Email(message = "Please enter a valid email")
	private String Email;
	
	@jakarta.validation.constraints.Pattern(regexp = "[6-9][0-9]{9}",message = "Mobile number should start with 6-9 and of size 10")
	private String mobileNumber;

}
