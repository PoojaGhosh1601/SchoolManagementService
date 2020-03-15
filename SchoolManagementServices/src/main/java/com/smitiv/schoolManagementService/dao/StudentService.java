package com.smitiv.schoolManagementService.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smitiv.schoolManagementService.repository.StudentRepo;
import com.smitiv.schoolManagementService.studentDetails.StudentDetails;

@Service
public class StudentService {

	@Autowired
	StudentRepo studentRepo;

	/* save a StudentDetails */

	public StudentDetails saveStudentDetails(StudentDetails student) {
		return studentRepo.save(student);

	}

}
