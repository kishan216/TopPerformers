package com.training.entity;

import org.springframework.stereotype.Component;

@Component
public class Department {
	private int deptId;
	private String name;
	private double total_Marks;
	private int total_Papers;
	private int total_Sports;
	private int total_Cultural;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int deptId, String name, double total_Marks, int total_Papers, int total_Sports,
			int total_Cultural) {
		super();
		this.deptId = deptId;
		this.name = name;
		this.total_Marks = total_Marks;
		this.total_Papers = total_Papers;
		this.total_Sports = total_Sports;
		this.total_Cultural = total_Cultural;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getTotal_Marks() {
		return total_Marks;
	}
	public void setTotal_Marks(double total_Marks) {
		this.total_Marks = total_Marks;
	}
	public int getTotal_Papers() {
		return total_Papers;
	}
	public void setTotal_Papers(int total_Papers) {
		this.total_Papers = total_Papers;
	}
	public int getTotal_Sports() {
		return total_Sports;
	}
	public void setTotal_Sports(int total_Sports) {
		this.total_Sports = total_Sports;
	}
	public int getTotal_Cultural() {
		return total_Cultural;
	}
	public void setTotal_Cultural(int total_Cultural) {
		this.total_Cultural = total_Cultural;
	}
	@Override
	public String toString() {
		return "deptId=" + deptId + ", name=" + name + ", total_Marks=" + total_Marks + ", total_Papers="
				+ total_Papers + ", total_Sports=" + total_Sports + ", total_Cultural=" + total_Cultural;
	}
	
}
