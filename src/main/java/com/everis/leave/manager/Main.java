package com.everis.leave.manager;

import com.everis.leave.manager.entity.Employe;
import com.everis.leave.manager.service.EmployeService;
import com.everis.leave.manager.service.impl.EmployeServiceImpl;

public class Main {

	public static void main(String[] args) {

		EmployeService employeService = new EmployeServiceImpl();

		employeService.create(new Employe("Imane", "Stitou"));
		employeService.create(new Employe("to delete firstName", "to delete lastName"));
		employeService.create(new Employe("Mohamed", "IdriIssi"));

		System.out.println(employeService.getAll());

		employeService.update(2l, new Employe("Mohemed", "Hamdane"));

		System.out.println("********************");
		System.out.println(employeService.getAll());

		System.out.println("********************");
		Employe employe = employeService.getById(0l);
		System.out.println(employe);

		System.out.println("********************");
		employeService.delete(1l);

		System.out.println(employeService.getAll());

	}

}
