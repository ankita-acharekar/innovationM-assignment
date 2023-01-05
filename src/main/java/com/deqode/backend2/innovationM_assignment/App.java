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

	public static void main(String[] args) throws Exception{

		File inFile = null;
		if (args.length > 0) {
			inFile = new File(args[0]);
			Employee emp = new Employee();
			Events events = new Events();
			try {
				BufferedReader br = new BufferedReader(new FileReader(inFile));
				String read = null;
				String[] empdata = new String[1];
                EmployeeController empController =new EmployeeController();

                while ((read = br.readLine()) != null) {
                	empdata[0] = read;

					empController.addEmp(empdata);
				}
                
                //Total number of employees in an organization.
				empController.totalemployees();
				
				//Month wise onboarded employees
				empController.findAllOnBoarded();
				
				//Monthly salary report
				empController.findAllDetails();
				
				//Employee wise financial report
				empController.EmployeeWiseFinancialReport();
				
				//Monthly salary report
				empController.monthlySalaryReport();
				
				//Monthly salary report
				empController.MontlySalaryBonusReport();
				
				//Yearly financial report
				empController.yearlyEventRecords();

			} catch (IOException e) {
				System.out.println("There was an issue: " + e);

			}
		}
	}
}