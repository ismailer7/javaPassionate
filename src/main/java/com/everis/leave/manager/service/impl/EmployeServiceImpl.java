package com.everis.leave.manager.service.impl;

import java.util.List;

import com.everis.leave.manager.database.StaticDatabase;
import com.everis.leave.manager.entity.Employe;
import com.everis.leave.manager.service.EmployeService;

public class EmployeServiceImpl implements EmployeService {

	public Employe create(Employe employe) {
		StaticDatabase.getEmployes().add(employe);
		return employe;
	}

	public Employe update(Long id, Employe employe) {
		StaticDatabase.getEmployes().set(id.intValue(), employe);
		return null;
	}

	public List<Employe> getAll() {
		return StaticDatabase.getEmployes();
	}

	public Employe getById(Long id) {
		return StaticDatabase.getEmployes().get(id.intValue());
	}

	public void delete(Long id) {
		StaticDatabase.getEmployes().remove(id.intValue());
	}

}
