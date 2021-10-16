package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Aravindh");

	}

	public void studentDept() {
		System.out.println("Ece");

	}

	public void studentId() {
		System.out.println("101");

	}
	public static void main(String[] args) {
		Student a=new Student();
		a.collegeCode();
		a.collegeName();
		a.collegeRank();
		a.deptName();
		a.studentName();
		a.studentDept();
		a.studentId();
		
		
	}

}
