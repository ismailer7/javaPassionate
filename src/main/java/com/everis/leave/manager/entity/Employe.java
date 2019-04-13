package com.everis.leave.manager.entity;

import com.everis.leave.manager.entity.enums.Level;

public class Employe extends Person {

	private Long id; // technical id

	private Long employeNumber;

	private Level level;

	private String project;

	private String technology;

	public Employe(String firstName, String lastName) {
		super(firstName, lastName);
	}

	public Employe(String firstName, String lastName, Long employeNumber, Level level, String project,
			String technology) {
		super(firstName, lastName);
		this.employeNumber = employeNumber;
		this.level = level;
		this.project = project;
		this.technology = technology;
	}

	public Long getEmployeNumber() {
		return employeNumber;
	}

	public void setEmployeNumber(Long employeNumber) {
		this.employeNumber = employeNumber;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

}
