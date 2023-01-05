package com.deqode.backend2.innovationM_assignment;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TreeMap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import com.deqode.backend2.innovationM_assignment.controller.EmployeeController;
import com.deqode.backend2.innovationM_assignment.mapper.Month;
import com.deqode.backend2.innovationM_assignment.model.Employee;
import com.deqode.backend2.innovationM_assignment.service.EmployeeService;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
//    extends TestCase
{

	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	@BeforeEach
	public void setUp() {
		System.setOut(new PrintStream(outputStreamCaptor));
	}

	@Test
	public void shouldAnswerWithTrue() {
		String inputfile = "sample_input" + File.separator + "Employee_payroll.txt";
		Date eventDate = new Date(01 - 11 - 2023);
		List<String> inputs = new ArrayList<String>();
		inputs.add(inputfile);

		EmployeeService es = new EmployeeService();
		Employee e = new Employee();
		e.setEmployeeId("emp101");
		e.setEmpFName("Bill");
		e.setEvent("ONBOARD");
		e.setEventDate(eventDate);
		e.setEmpLName("Gates");
		es.addEmployee(e.getEmployeeId(), e);
		EmployeeController emp = new EmployeeController();

		emp.setEmployeeService(es);

		emp.totalemployees();

		String expectedoutput = "Total number of employees is : 1";

		Assertions.assertEquals(expectedoutput, outputStreamCaptor.toString().trim());
	}

	@Test
	public void shouldAnswerWithTrue1() {
		Date eventDate = new Date(01 - 11 - 2023);
		List<String> inputs = new ArrayList<>();

		EmployeeService es = new EmployeeService();
		Employee e = new Employee();
		e.setEmployeeId("emp101");
		e.setEmpFName("Ankita");
		e.setEvent("ONBOARD");
		e.setEventDate(eventDate);
		e.setEmpLName("Acharekar");
		es.addEmployee(e.getEmployeeId(), e);
		EmployeeController emp = new EmployeeController();

		emp.setEmployeeService(es);

		emp.EmployeeWiseFinancialReport();

		String expectedoutput = "------------------------------Employee wise financial report--------------------------------\n"
				+ "Employee Id , Name , Surname , Total amount paid\n"
				+ "emp101 Ujjwal Gupta 0";

		Assertions.assertEquals(expectedoutput, outputStreamCaptor.toString().trim());
	}
}
