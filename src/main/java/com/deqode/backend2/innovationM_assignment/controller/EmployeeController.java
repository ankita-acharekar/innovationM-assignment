package com.deqode.backend2.innovationM_assignment.controller;

/**
 * Author : Ankita Acharekar
 *
 */
import java.util.List;

import com.deqode.backend2.innovationM_assignment.model.Employee;
import com.deqode.backend2.innovationM_assignment.model.Events;
import com.deqode.backend2.innovationM_assignment.service.EmployeeService;

public class EmployeeController {

	private EmployeeService employeeService = new EmployeeService();

	public void addEmp(String[] empinfo) {
		Employee emp = new Employee();
		Events eve = new Events();
		for (String part : empinfo) {
			String[] singlerecord = part.split(",");

			if (part.contains("ONBOARD")) {
				emp.setSequenceNo(Integer.valueOf(singlerecord[0]));
				emp.setEmployeeId((singlerecord[1]));
				emp.setEmpFName(singlerecord[2]);
				emp.setEmpLName(singlerecord[3]);
				emp.setDesignation(singlerecord[4]);
				eve.setEvent(singlerecord[5]);
				eve.setEventValue(singlerecord[6]);
				eve.setNotes((singlerecord[6]));
				List<Events> eventlist = List.of(eve);
				emp.setEvents(eventlist);
				employeeService.addEmployee(emp.getEmployeeId(), emp);
			} else if (part.contains("SALARY")) {
				Employee e = employeeService.findByEmpId(singlerecord[1]);
				e.setSalary(Integer.parseInt(singlerecord[3].trim()));
				employeeService.addEmployee(e.getEmployeeId(), e);
			} else if (part.contains("BONUS")) {

			}

			else if (part.contains("REIMBURSEMENT")) {

			} else if (part.contains("EXIT")) {

			}
		}
	}

	public void totalemployees() {
		employeeService.TotalEmployees();
	}

	public List<Employee> findAllDetails() {
		return employeeService.findAll();
	}

	public void EmployeeWiseFinancialReport() {
        employeeService.printEmployeeFinancialReport();

	}
}
