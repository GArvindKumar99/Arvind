package com.te.reflect.bean;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class EmployeeAddressInfo {
	
	@Id
	@Column(name= "emp_addrId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addrId;
	@Column(name= "emp_addrType")
	private String addrType;
	@Column(name= "emp_city")
	private String city;
	@Column(name= "emp_pincode")
	private long pincode;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private EmployeePrimaryInfo paInfo;

}