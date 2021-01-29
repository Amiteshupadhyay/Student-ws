package com.example.demo.Operations;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	@Autowired
	Validator validator;

	static Map<String, Student> h = new HashMap<>();

	String createStudent(Student s) {
		if (!h.containsKey(s.getRollno()))
			h.put(s.getRollno(), s);
		return "Created\n" + s.toString();

	}

	String getAge(Student s) {

		if (h.containsKey(s.getRollno())) {
			Student memoryStd = h.get(s.getRollno());
			Period period = Period.between(LocalDate.now(), memoryStd.getDOB());
			return period.getYears() + " " + period.getMonths() + " " + period.getDays();
		}
		return null;

	}

}
