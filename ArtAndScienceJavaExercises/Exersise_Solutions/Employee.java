import acm.program.*;

import acm.util.*;
import java.awt.Color;

import acm.graphics.*;

/*
 * 
 * 
 * */

public class Employee extends ConsoleProgram {
	
	public Employee(String name, String supervisor, double salary) {
		
		emplName = name;
		
		emplSupervisor = supervisor;
		emplSalary = salary;
		
	}
	
	public String getName() {
		return emplName;
	}
	
	public String getSupervisor() {
		return emplSupervisor;
	}

	public double getSalary() {
		return emplSalary;
	}
	
	public double doubleSalary() {
		emplSalary= emplSalary*2;
		return emplSalary;
	}

	public String toString() {
		return getName()+" "+ getSupervisor() + " "+ getSalary();
	}
	
private String emplName;
private String emplSupervisor;
private double emplSalary;
	
}
