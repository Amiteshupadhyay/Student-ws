package com.example.demo.operations;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class Validator {

	public boolean isValid(Student s) {
		for (int i = 0; i < s.getName().length(); i++) {
			if (!Character.isAlphabetic(s.getName().charAt(i))) {
				return false;
			}
		}

		for (int i = 0; i < s.getRollno().length(); i++) {
			if (!Character.isAlphabetic(s.getRollno().charAt(i)) || !Character.isDigit(s.getRollno().charAt(i))) {
			//	return false;
			}
		}

		// taking age 120 as allowed Value
		if (LocalDate.now().getYear() - s.getDOB().getYear() > 120) {
			return false;
		}
		return true;
	}

}
