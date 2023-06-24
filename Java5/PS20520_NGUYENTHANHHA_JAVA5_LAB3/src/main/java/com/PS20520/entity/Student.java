package com.PS20520.entity;

import java.util.List;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	@NotBlank
	String name;
	@NotBlank(message = "Vui lòng nhập email")
	@Email(message = "Vui lòng nhập đúng định dạng email")
	String email;
	@Min(0)
	@Max(10)
	@NotNull(message = "Vui lòng nhập điểm")
	Double marks;
	@NotNull(message = "Vui lòng chọn giới tính")
	Boolean gender;
	@NotBlank(message = "Vui lòng chọn khoa")
	String faculty;
	@NotEmpty(message = "Vui lòng chọn sở thích")
	List<String> hobbies;
	
}
