package com.doctor;

import com.hospital.staff.doctor.salary.*; 

class Doc1 extends com.hospital.staff.doctor.salary.Salary{
	@Override
	protected double calculateSalary(double amt, double tax) {
		return super.calculateSalary(amt, tax);
	}
	
}

public class Doctor extends Salary{ 
	public static void main(String[] args) {
		Doctor doctor = new Doctor();
		System.out.println(doctor.calculateSalary(1000, 100));
		
		Doc1 doc1 = new Doc1();
		System.out.println(doc1.calculateSalary(2000, 100));
	}
	

}
