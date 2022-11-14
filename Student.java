package com.te.javabasics;

import java.util.Objects;

public class Student {
	int stdid;
	String stdname;
	int stdage;
	int stdmark;
	public Student(int stdid, String stdname, int stdage, int stdmark) {
		this.stdid = stdid;
		this.stdname = stdname;
		this.stdage = stdage;
		this.stdmark = stdmark;
	}
	@Override
	public String toString() {
		return "Student [stdid=" + stdid + ", stdname=" + stdname + ", stdage=" + stdage + ", stdmark=" + stdmark + "]";
	}
	@Override
	public int hashCode() {
		
		return Objects.hash(stdid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (stdid != other.stdid)
			return false;
		return true;
	}
	

}