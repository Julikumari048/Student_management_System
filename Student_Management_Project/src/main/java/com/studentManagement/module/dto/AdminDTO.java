package com.studentManagement.module.dto;

public class AdminDTO {
	

	private Integer adminId;
	
	@jakarta.validation.constraints.NotNull(message = "name can't be null")
	@jakarta.validation.constraints.NotBlank(message = "name can't be blank")
	@jakarta.validation.constraints.NotEmpty(message = "name can't be empty")
	@jakarta.validation.constraints.Size(min = 3, max = 30, message = "name size should be between 3 to 30 char")
	private String name;
	
	@jakarta.validation.constraints.Pattern(regexp = "[6789][0-9]{9}",message = "Enter 10 digit mobile no")
	private String mobileNumber;
	
	@jakarta.validation.constraints.Size(min = 8, max = 12, message = "password must be between 8-12")
	private String password;
	
	@jakarta.validation.constraints.NotNull(message = "role can not be null")
	private String role;

}
