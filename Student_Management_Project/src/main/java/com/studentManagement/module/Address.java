package com.studentManagement.module;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@jakarta.persistence.Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Address {
     
	@jakarta.persistence.Id
	@jakarta.persistence.GeneratedValue
	 private Integer addressId;
	
	@NotNull(message = "area can't be Null")
	@NotBlank(message = "area can't be blank")
	@NotEmpty(message = "area can't be empty")
	 private String area;
	
	@NotNull(message = "city can't be Null")
	@NotBlank(message = "city can't be blank")
	@NotEmpty(message = "city can't be empty")
	 private String city;
	
	@NotNull(message = "district can't be Null")
	@NotBlank(message = "district can't be blank")
	@NotEmpty(message = "district can't be empty")
	 private String district;
	
	@NotNull(message = "state can't be Null")
	@NotBlank(message = "state can't be blank")
	@NotEmpty(message = "state can't be empty")
	 private String state;
	
	@NotNull(message = "pincode can't be Null")
	@NotBlank(message = "pincode can't be blank")
	@NotEmpty(message = "pincode can't be empty")
	 private String pincode;
	
	
	 private Address typeOfAddress;
	 
}
