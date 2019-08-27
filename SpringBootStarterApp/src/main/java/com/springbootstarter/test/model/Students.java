package com.springbootstarter.test.model;

public class Students {
private String name;
private String rollNo;
private String standard;
public Students(String name, String rollNo, String standard) {
	this.name=name;
	this.rollNo=rollNo;
	this.standard=standard;
	// TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getRollNo() {
	return rollNo;
}
public void setRollNo(String rollNo) {
	this.rollNo = rollNo;
}
public String getStandard() {
	return standard;
}
public void setStandard(String standard) {
	this.standard = standard;
}
}
