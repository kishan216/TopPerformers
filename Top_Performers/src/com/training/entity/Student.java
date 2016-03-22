package com.training.entity;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private int id;
	private String name;
	private double marks;
	private int papers;
	private int sports;
	private int cultural;
	private Department dept;
	private double grade;
	
	public double getGrade() {
		return grade;
	}


	public void setGrade(double grade) {
		this.grade = grade;
	}


	public Student(int id, String name, double marks, int papers, int sports, int cultural, Department dept) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.papers = papers;
		this.sports = sports;
		this.cultural = cultural;
		this.dept = dept;
	}

	
	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		dept.getDeptId();
		this.dept = dept;
	}


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	public int getPapers() {
		return papers;
	}
	public void setPapers(int papers) {
		this.papers = papers;
	}
	
	public int getSports() {
		return sports;
	}
	public void setSports(int sports) {
		this.sports = sports;
	}
	
	public int getCultural() {
		return cultural;
	}
	public void setCultural(int cultural) {
		this.cultural = cultural;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", papers=" + papers + ", sports=" + sports
				+ ", cultural=" + cultural + ", dept=" + dept + "]";
	}
	
	public double calculate(){
		double grade;
		grade=(((marks/dept.getTotal_Marks())*50)+((papers/dept.getTotal_Papers())*10)+((sports/dept.getTotal_Sports())*20)+((cultural/dept.getTotal_Cultural())*20));
		return grade;
	}
}
