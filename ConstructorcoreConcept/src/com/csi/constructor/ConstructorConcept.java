package com.csi.constructor;

class Employee {
	int empId = 222;
	String empName = "VEERA";
	double empSalary = 98765.98;

	public Employee() {
		System.out
				.println("\n Employee Id:" + empId + "\n Employee Name:" + empName + "\n Employee Salary:" + empSalary);

	}

	public Employee(String empAddress, long empcontactNumber) {
		System.out.println("\n Employee Address: " + empAddress + "\n Employee Contact Number:" + empcontactNumber);
	}
}

public class ConstructorConcept {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee("NASHIK", 9879887799L);
	}
}
