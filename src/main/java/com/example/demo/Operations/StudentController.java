package com.example.demo.Operations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

	 @Autowired
	 StudentService studentService;

	@GetMapping("/healthCheck")
	public String status() {
		return "Status: "+HttpStatus.OK;
	}

	@PostMapping(path = "/createstudent",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public String createStudent(@RequestBody Student student){
		return studentService.createStudent(student);
	}

	@PostMapping(path = "/studentage",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public String getAge(Student student){
		return studentService.getAge(student);
		
	}

}
