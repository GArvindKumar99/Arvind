package com.te.reflect.bean;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class EmployeeSecondaryInfo {

	@Id
	@Column(name= "emp_panNo")
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int panNo;
	@Column(name= "emp_aad")
	private Long aadNo;
	@Column(name= "emp_fname")
	private String fatherName;
	@Column(name= "emp_mname")
	private String motherName;
	
	@OneToOne(cascade = CascadeType.ALL)
	private EmployeePrimaryInfo psInfo;

}