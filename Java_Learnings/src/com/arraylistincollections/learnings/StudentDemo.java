package com.arraylistincollections.learnings;

public class StudentDemo   {
	
	
	private String studentName;
	private int rollNo;
	private int studentAge;
	
	public StudentDemo(String sname, int rollno, int sage) {
		
		this.studentName = sname;
		this.rollNo =rollno;
		this.studentAge = sage;
	}
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

}
