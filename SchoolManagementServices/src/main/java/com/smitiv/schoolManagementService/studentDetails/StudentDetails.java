package com.smitiv.schoolManagementService.studentDetails;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="StudentDetails")
@EntityListeners(AuditingEntityListener.class)

public class StudentDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="studentid")
	private Long studentid;
	
	
	private Long standard;
	
	@NotBlank
	private String studentname;
	
	@NotBlank
	private String address;
	
	
	private Long age;
	
	@NotBlank
	private String department;
	
	@NotBlank
	private String contact;

	public Long getStudentid() {
		return studentid;
	}

	public void setStudentid(Long studentid) {
		this.studentid = studentid;
	}

	public Long getStandard() {
		return standard;
	}

	public void setStandard(Long standard) {
		this.standard = standard;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
	
	
	
	
	
}
