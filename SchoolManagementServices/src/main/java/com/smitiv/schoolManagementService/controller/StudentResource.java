package com.smitiv.schoolManagementService.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public StudentDetails RegisterStudentDetails(@RequestBody StudentDetails student) {
		return studentService.saveStudentDetails(student);
	}
	
	@GetMapping("/getAllStudents")
	public List<StudentDetails> getAllStudent() {
		return studentService.findAllStudents();
	}
	
	@GetMapping("/personaldetailsby/student/{studentid}")
	public ResponseEntity<Optional<StudentDetails>> getStudentById(@PathVariable(value = "studentid") Long studentid) {

		Optional<StudentDetails> student = studentService.findAStudentRecord(studentid);

		if (student == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(student);

	}


}
