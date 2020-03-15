package com.smitiv.schoolManagementService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smitiv.schoolManagementService.studentDetails.StudentDetails;

@Repository(value="studentRepo")
public interface StudentRepo extends JpaRepository<StudentDetails, Long> {

}
