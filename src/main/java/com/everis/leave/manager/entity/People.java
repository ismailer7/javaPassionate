package com.everis.leave.manager.entity;

import com.everis.leave.manager.entity.enums.PeopleLevel;

public class People {

	private String employeNumber;

	private PeopleLevel level;

	public People() {
		super();
		// TODO Auto-generated constructor stub
	}

	public People(String employeNumber, PeopleLevel level) {
		super();
		this.employeNumber = employeNumber;
		this.level = level;
	}

	public String getEmployeNumber() {
		return employeNumber;
	}

	public void setEmployeNumber(String employeNumber) {
		this.employeNumber = employeNumber;
	}

	public PeopleLevel getLevel() {
		return level;
	}

	public void setLevel(PeopleLevel level) {
		this.level = level;
	}

}
