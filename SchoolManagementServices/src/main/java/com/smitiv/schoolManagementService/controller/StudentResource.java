package com.smitiv.schoolManagementService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smitiv.schoolManagementService.dao.StudentService;
import com.smitiv.schoolManagementService.exception.RecordNotFoundException;
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
	
	@DeleteMapping("/DeleteSpecificStudent/{studentid}")
	public HttpStatus deleteSpecificStudent(@PathVariable(value="studentid") Long studentid) throws RecordNotFoundException {
		studentService.deleteStudentById(studentid);
		return HttpStatus.MOVED_PERMANENTLY;
	}

}
