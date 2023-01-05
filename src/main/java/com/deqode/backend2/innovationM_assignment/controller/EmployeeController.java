package com.deqode.backend2.innovationM_assignment.controller;

/**
 * Author : Ankita Acharekar
 *
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.deqode.backend2.innovationM_assignment.model.Employee;
import com.deqode.backend2.innovationM_assignment.model.Events;
import com.deqode.backend2.innovationM_assignment.service.EmployeeService;

public class EmployeeController {

	private EmployeeService employeeService = new EmployeeService();

	// Add or Onboard New Employee
	public void addEmp(String[] empinfo) throws Exception {
		Employee emp = new Employee();
		Events eve = new Events();
		for (String part : empinfo) {
			String[] singlerecord = part.split(",");

			if (part.contains("ONBOARD")) {
				String date = singlerecord[6];

				try {
					Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(date);
					emp.setEventDate(date1);
				} catch (ParseException e) {
					e.printStackTrace();
				}

				emp.setSequenceNo(Integer.valueOf(singlerecord[0]));
				emp.setEmployeeId((singlerecord[1]));
				emp.setEmpFName(singlerecord[2]);
				emp.setEmpLName(singlerecord[3]);
				emp.setDesignation(singlerecord[4]);
				emp.setEventRecordDate(singlerecord[7]);
				emp.setEventRecordValue(singlerecord[6]);
				emp.setEvent(singlerecord[5]);
				eve.setEvent(singlerecord[5]);
				eve.setEventValue(singlerecord[6]);
				eve.setNotes((singlerecord[8]));
				eve.setEventEmpId(singlerecord[1]);
				List<Events> eventlist = List.of(eve);
				emp.setEvents(eventlist);
				employeeService.addEmployee(emp.getEmployeeId(), emp);
			} else if (part.contains("SALARY")) {
				Employee e = employeeService.findByEmpId(singlerecord[1]);
				e.setSalary(Integer.parseInt(singlerecord[3].trim()));
				e.setEventRecordDate(singlerecord[4]);
				e.setEventRecordValue(singlerecord[3]);
				e.setEvent(singlerecord[2]);
				employeeService.updateSalaryOfEmployee(e.getEmployeeId(), e);
			} else if (part.contains("BONUS")) {
				Employee e = employeeService.findByEmpId(singlerecord[1]);
				e.setBonus(Integer.parseInt(singlerecord[3].trim()));
				e.setEventRecordDate(singlerecord[4]);
				e.setEventRecordValue(singlerecord[3]);
				e.setEvent(singlerecord[2]);
				employeeService.updateBonusOfEmployee(e.getEmployeeId(), e);
			}

			else if (part.contains("REIMBURSEMENT")) {
				Employee e = employeeService.findByEmpId(singlerecord[1]);
				e.setReimbursement(Integer.parseInt(singlerecord[3].trim()));
				e.setEventRecordDate(singlerecord[4]);
				e.setEventRecordValue(singlerecord[3]);
				e.setEvent(singlerecord[2]);
				employeeService.updateReimbursementOfEmployee(e.getEmployeeId(), e);

			} else if (part.contains("EXIT")) {
				Employee e = employeeService.findByEmpId(singlerecord[1]);
				String empId = singlerecord[1].trim();
				e.setEventRecordDate(singlerecord[4]);
				e.setEventRecordValue(singlerecord[3]);
				e.setEvent(singlerecord[2]);
				employeeService.removeEmployee(empId);

			} else {
				throw new Exception();
			}
		}
	}

	// Total number of employees in an organization.
	public int totalemployees() {
		return employeeService.TotalEmployees();
	}

	// Month wise onboarded employees
	public void findAllOnBoarded() {
		employeeService.findAllOnboarded();
	}

	// Monthly salary report
	public List<Employee> findAllDetails() {
		return employeeService.findAll();
	}

	// Employee wise financial report
	public void EmployeeWiseFinancialReport() {
		employeeService.printEmployeeFinancialReport();
	}

	// Monthly salary report
	public void monthlySalaryReport() {
		employeeService.findMontlySalaryReport();
	}

	// Monthly salary + Bonus + Reimbursement report in following format
	public void MontlySalaryBonusReport() {
		employeeService.findMontlySalaryBonusReport();

	}

	// Yearly financial report
	public void yearlyEventRecords() {
		employeeService.yearlyEventRecords();
	}

	public void setEmployeeService(EmployeeService employeeService) {
		 this.employeeService = employeeService;
	}
}
