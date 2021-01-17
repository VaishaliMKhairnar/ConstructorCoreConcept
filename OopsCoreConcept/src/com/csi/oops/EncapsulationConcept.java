package com.csi.oops;

class Employee {
	private int empId;
	private String empName;
	private double empSalary;
	private long empContactnumber;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public long getEmpContactnumber() {
		return empContactnumber;
	}

	public void setEmpContactnumber(long empContactnumber) {
		this.empContactnumber = empContactnumber;
	}

}

public class EncapsulationConcept {
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setEmpId(121);
		e1.setEmpName("VEER");
		e1.setEmpSalary(223456.666);
		e1.setEmpContactnumber(3475588855L);
		System.out.println("\n Emplyee Id:"+e1.getEmpId()+"\n Employee Name:"+e1.getEmpName()+"\n Employee ContactNumber:"+e1.getEmpContactnumber()+"\n Employee Salary:"+e1.getEmpSalary());
	}
}
