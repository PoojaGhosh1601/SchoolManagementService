package com.smitiv.schoolManagementService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smitiv.schoolManagementService.dao.StudentService;
import com.smitiv.schoolManagementService.studentDetails.StudentDetails;

@RestController
@RequestMapping("/studentRows")
public class StudentResource {
	@Autowired
	StudentService studentService;

	@PostMapping("/registerdetails")
	public StudentDetails RegisterEmployeeDetails(@RequestBody StudentDetails student) {
		return studentService.saveStudentDetails(student);
	}

}
