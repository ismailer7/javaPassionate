package com.everis.leave.manager.database;

import java.util.ArrayList;
import java.util.List;

import com.everis.leave.manager.entity.Employe;

public class StaticDatabase {

	private static List<Employe> employeList = new ArrayList<Employe>();

	public static List<Employe> getEmployes() {
		return employeList;
	}
}
