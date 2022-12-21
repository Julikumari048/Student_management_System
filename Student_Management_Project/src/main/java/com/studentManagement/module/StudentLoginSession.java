package com.studentManagement.module;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@jakarta.persistence.Entity
public class StudentLoginSession {
      
	@jakarta.persistence.Id
	@jakarta.persistence.Column(unique = true)
	@jakarta.validation.constraints.NotNull(message = "studentId can't be null")
	private Integer studentId;
	
	private String uuid;
	
	private LocalDateTime localDateTime;
}
