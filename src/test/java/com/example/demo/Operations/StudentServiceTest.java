package com.example.demo.Operations;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.example.demo.operations.Student;
import com.example.demo.operations.StudentService;
import com.example.demo.operations.Validator;
//import static org.junit.Assert.assertEquals;

class StudentServiceTest {
	
	@InjectMocks
	StudentService studentService;

	@Mock
	Validator validator;
	 

	Student getStudent() {
		return new Student("ABC", "123", LocalDate.now());
	}

	@Test
	void createStudentTest() {
		Student student = getStudent();
		validator.isValid(student);
		studentService.createStudent(student);
		//assertEquals();
	}

}
