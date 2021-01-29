package com.example.demo.Operations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	StudentService studentService;

	@Autowired
	Validator validator;

	@PostMapping(path = "/createstudent", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> createStudent(@RequestBody Student student) {
		if (validator.isValid(student))
			return new ResponseEntity<>(studentService.createStudent(student), HttpStatus.OK);
		else {
			return new ResponseEntity<>("Invalid Request", HttpStatus.BAD_REQUEST);
		}
	}

	@PostMapping(path = "/studentage", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getAge(Student student) {
		if (validator.isValid(student))
			return new ResponseEntity<>(studentService.getAge(student), HttpStatus.OK);
		else {
			return new ResponseEntity<>("Invalid Request", HttpStatus.BAD_REQUEST);
		}
	}

}
