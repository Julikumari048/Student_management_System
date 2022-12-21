package com.studentManagement.module;


import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@jakarta.persistence.Entity
public class AdminLoginSession {
	
	@jakarta.persistence.Id
	@jakarta.persistence.Column(unique = true)
	@jakarta.validation.constraints.NotNull(message = "adminId can't be null")
	private Integer adminId;
	
	private String uuid;
	
	private LocalDateTime localDateTime;

}
