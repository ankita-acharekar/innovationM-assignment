package com.deqode.backend2.innovationM_assignment;
/**
 * Author : Ankita Acharekar
 *
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import com.deqode.backend2.innovationM_assignment.controller.EmployeeController;
import com.deqode.backend2.innovationM_assignment.model.Employee;
import com.deqode.backend2.innovationM_assignment.model.Events;

public class App {

	static ArrayList<String> records = new ArrayList<>();
	HashMap<String, Employee> hashMap = new HashMap<>();
	Employee employee = new Employee();

	public static void main(String[] args) {

		File inFile = null;
		if (args.length > 0) {
			inFile = new File(args[0]);
			Employee emp = new Employee();
			Events events = new Events();
			try {
				BufferedReader br = new BufferedReader(new FileReader(inFile));
				String read = null;
				String[] empdata;
				EmployeeController empController = new EmployeeController();

				while ((read = br.readLine()) != null) {
					empdata = read.split("\\.");

					empController.addEmp(empdata);
				}
				empController.totalemployees();
				empController.findAllDetails();
				empController.EmployeeWiseFinancialReport();

			} catch (IOException e) {
				System.out.println("There was a problem: " + e);

			}
		}
	}
}