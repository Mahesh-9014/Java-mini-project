package com.oops.inheritance;

public class HomeLoan extends LoanInf {

	public static void main(String[] args) {

		HomeLoan h = new HomeLoan();
		String name = h.getName();
		System.out.println("Welcome to SBI HomeLoan!! Mr." + name);

		if (h.isPhoneValid() && h.isAadharValid() && h.isPANValid()) {

			double salary = h.getSalary();
			int age = h.getAge();
			int cibil = h.cibil();
			double interest = h.getRIT(cibil);
			if (salary >= 800000.00 && (age >= 20 && age <=45) && (cibil >= 300 && cibil <= 900)) {
				System.out.println("And you are eligible for home loan with interest of : " + interest + "%");
			} else {
				System.out.println("Not eleigible for home loan");
			}
		} else {
			System.out.println("Invalid details");
		}

	}

}
