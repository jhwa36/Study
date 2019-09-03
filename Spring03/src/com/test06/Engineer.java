package com.test06;

public class Engineer {
	
	private Emp emp;
	private String dept;
	
	public Engineer() {
		
	}
	
	public Engineer(Emp emp, String dept) {
		super();
		this.emp = emp;
		this.dept = dept;
	}

	public Emp getEmp() {
		return emp;
	}
	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "이름 : " + emp + "\t 월급 : " + dept;
	}
	
}
