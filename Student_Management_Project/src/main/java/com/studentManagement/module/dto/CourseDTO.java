package com.studentManagement.module.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CourseDTO {
	private Integer courseId;
	
	@jakarta.validation.constraints.NotNull(message = "course name can not be Null")
	@jakarta.validation.constraints.NotBlank(message = "course name can not be blank")
	@jakarta.validation.constraints.NotEmpty(message = "course name can not  be empty")
	@jakarta.validation.constraints.Size(min = 2, max = 30,message = "course name size should be of 2-30")
	private String courseName;
	
	@jakarta.validation.constraints.NotNull(message = "description can not  be Null")
	@jakarta.validation.constraints.NotBlank(message = "description can not  be blank")
	@jakarta.validation.constraints.NotEmpty(message = "description can not  be empty")
	@jakarta.validation.constraints.Size(min = 10,max = 500,message = "description size should be of 10-500")
	private String description;
	
	@jakarta.validation.constraints.NotNull(message = "course type can't be Null")
	@jakarta.validation.constraints.NotBlank(message = "course type can't be blank")
	@jakarta.validation.constraints.NotEmpty(message = "course type can't be empty")
	private String courseType;
	
	@jakarta.validation.constraints.NotNull(message = "duration can't be Null")
	@jakarta.validation.constraints.NotBlank(message = "duration can't be blank")
	@jakarta.validation.constraints.NotEmpty(message = "duration can't be empty")
	private String duration;
	
	@jakarta.validation.constraints.NotNull(message = "topic can't be Null")
	@jakarta.validation.constraints.NotBlank(message = "topic can't  be blank")
	@jakarta.validation.constraints.NotEmpty(message = "topic can't  be empty")
	private String topics;

}
