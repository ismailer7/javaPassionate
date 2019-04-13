package com.everis.leave.manager.service;

import java.util.List;

import com.everis.leave.manager.entity.Employe;

public interface EmployeService {

	Employe create(Employe employe);

	Employe update(Long id, Employe employe);

	List<Employe> getAll();

	Employe getById(Long id);

	void delete(Long id);

}
