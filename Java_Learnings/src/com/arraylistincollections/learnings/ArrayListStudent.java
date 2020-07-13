package com.arraylistincollections.learnings;

public class ArrayListStudent {
	
	//Override toString method for ArrayList in Java
	
	private String studentName;
	private int studentAge;
	
	
	public ArrayListStudent(String sname, int sage) {
		// TODO Auto-generated constructor stub
		
		this.studentName = sname;
		this.studentAge = sage;
	}
	@Override
	public String toString() {
		
		return "Name is : "+this.studentName+ " & Age is "+this.studentAge;
	}

}
