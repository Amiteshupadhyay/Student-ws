package com.example.demo.operations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.definations.IStudentController;

@RestController
@RequestMapping("/students")
public class StudentController implements IStudentController {

	@Autowired
	StudentService studentService;

	@Autowired
	Validator validator;

	public ResponseEntity<String> createStudent(@RequestBody Student student) {
		if (validator.isValid(student))
			return new ResponseEntity<>(studentService.createStudent(student), HttpStatus.OK);
		else {
			return new ResponseEntity<>("Invalid Request", HttpStatus.BAD_REQUEST);
		}
	}

	public ResponseEntity<String> getAge(Student student) {
		if (validator.isValid(student))
			return new ResponseEntity<>(studentService.getAge(student), HttpStatus.OK);
		else {
			return new ResponseEntity<>("Invalid Request", HttpStatus.BAD_REQUEST);
		}
	}

}
