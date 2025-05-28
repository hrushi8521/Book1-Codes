package main;

import cons.*;

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp();
		System.out.println(emp.calSal(1000));

		Manager manager = new Manager();
		System.out.println(manager.calSal(1000, 50));
	}
}
