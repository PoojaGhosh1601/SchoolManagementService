package com.smitiv.schoolManagementService.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smitiv.schoolManagementService.exception.RecordNotFoundException;
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

	public List<StudentDetails> findAllStudents() {
		return studentRepo.findAll();

	}

	public void deleteStudentById(Long studentid) throws RecordNotFoundException {
		Optional<StudentDetails> student = studentRepo.findById(studentid);

		if (student.isPresent()) {
			studentRepo.deleteById(studentid);
		} else {
			throw new RecordNotFoundException("No Student record exist for given id");
		}
	}

}
