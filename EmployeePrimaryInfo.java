package com.te.reflect.bean;


	import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
	import javax.persistence.OneToMany;
	import javax.persistence.OneToOne;

	import lombok.Data;

	@Entity
	@Data

	public class EmployeePrimaryInfo implements Serializable {
		
		@Id
		@Column(name= "emp_id")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int empId;
		@Column(name= "emp_name")
		private String empName;
		@Column(name= "emp_age")
		private int empAge;
		@Column(name= "emp_desig")
		private String designation;
		
		@OneToOne(cascade = CascadeType.ALL,mappedBy = "psInfo")
		private EmployeeSecondaryInfo secondaryinfo;
		
		@OneToMany (cascade = CascadeType.ALL, mappedBy = "paInfo")
		private List<EmployeeAddressInfo> addressinfo;
	}

