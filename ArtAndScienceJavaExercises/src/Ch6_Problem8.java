import acm.program.*;

import acm.util.*;
import java.awt.Color;

import acm.graphics.*;

/*
 * 
 * 
 * */

public class Ch6_Problem8 extends ConsoleProgram {
	
	public void run() {
	setFont("Helvetica-40");
		
	
		
	//name = "";
	name = readLine("Enter name: ");	
	supervisor2 = readLine("Enter Supervisor: ");	
	salary2 = readInt("Enter salary: ");
	
	//readLine("supervisor: " + supervisor2);
	//readInt("salary: "+ salary);
	Employee newEmpl = new Employee(name, supervisor2, salary2);
	
	println("Employee Name: "+newEmpl.getName());
	println("Employee supervisor:" + newEmpl.getSalary());
	println("Employee Salary: " + newEmpl.getSupervisor());
	
	
	
	println("Summary: " +newEmpl.toString());
	
	//println("Salary was doubled ");
	//newEmpl.doubleSalary();
	
	//println("New Salary"+newEmpl.getSalary());
		
	//println("New Record: "+newEmpl.toString());
	}
	
	private String name;
	private String supervisor2;
	private int salary2;
	

	
	
	
	
	

	
}