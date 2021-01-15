package com.csi.upcasting;

public class UpcastingConcept {
	public static void main(String[] args) {
		int empId = 222;
		long employeeId = empId;
		System.out.println("Employee Id:" + employeeId);

		double productPrice = 33.99;
		int pPrice = (int) productPrice;
		System.out.println("Product Price:" + pPrice);

		int productCode = 34567;
		String pCode = String.valueOf(productCode);
		System.out.println("pCode:" + pCode);

		String companyId = "6565";
		int cId = Integer.valueOf(companyId);

		System.out.println("Company Id:" + cId);
		double d = 166.66;
		long l = (long) d;
		System.out.println("\n Long Type:" + l);

		double d1 = 166.66;
		float f = (float) d1;
		System.out.println("\n float type:" + f);

		double d2 = 233.98;
		char c = (char) d2;
		System.out.println("\n Character Type:" + c);

		double d3 = 237.89;
		short s = (short) d3;
		System.out.println("Short Data Type:" + s);

		double d4 = 245.89;
		byte b = (byte) d4;
		System.out.println("byte Type:" + b);

		float f1 = 16.6f;
		long l1 = (long) f1;
		System.out.println("\n Long Type:" + l1);

		float f2 = 16.6f;
		int i2 = (int) f2;
		System.out.println("\n int Type:" + i2);

		float f4 = 5.6f;
		char c4 = (char) f4;
		System.out.println("\n char Type:" + c4);

		float f5 = 5.6f;
		short s1 = (short) f5;
		System.out.println("\n short Type:" + s1);

		float f6 = 99.99f;
		byte b1 = (byte) f6;
		System.out.println("\n byte Type:" + b1);

		long l3 = 122;
		int i3 = (int) l3;
		System.out.println("\n int type:" + i3);

		long l4 = 122;
		char c5 = (char) l4;
		System.out.println("\n char type:" + c5);

		long l5 = 122;
		short s2 = (short) l5;
		System.out.println("\n short type:" + s2);

		long l6 = 122;
		byte b3 = (byte) l6;
		System.out.println("\n byte type:" + b3);

		int deptCode = 111;
		char c6 = (char) deptCode;
		System.out.println("\n char type:" + c6);

		int i6 = 111;
		short s5 = (short) i6;
		System.out.println("\n short type:" + s5);

		int i7 = 111;
		byte b4 = (byte) i7;
		System.out.println("\n byte type:" + b4);

		int custId = 222;
		long customerId = custId;
		char c8 = (char) customerId;
		System.out.println("long type:" + c8);

		int custId1 = 222;
		long customerId2 = custId1;
		float f8 = (float) customerId2;
		double d6 = (double) f8;
		System.out.println("double type:" + d6);
		
		

	}

}
