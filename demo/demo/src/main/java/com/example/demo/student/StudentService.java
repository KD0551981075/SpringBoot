package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

	public List<Student> getStrudentData()
	{
		return List.of(
				//new obj
			new Student("datta", "datta@yahoo.com", LocalDate.of(1999, 9, 8), 99)
				);
	}
}
