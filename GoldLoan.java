package com.oops.inheritance;

public class GoldLoan extends LoanInf {

	public static void main(String[] args) {

		GoldLoan g = new GoldLoan();
		String name = g.getName();
		System.out.println("Welcome to SBI GoldLoan!! Mr." + name);

		if (g.isPhoneValid() && g.isAadharValid() && g.isPANValid()) {

			double salary = g.getSalary();
			int age = g.getAge();
			int cibil = g.cibil();
			double interest = g.getRIT(cibil);
			if (salary >= 700000.00 && (age >= 20 && age <=50) && (cibil >= 300 && cibil <= 900)) {
				System.out.println("And you are eligible for gold loan with interest of : " + interest + "%");
			} else {
				System.out.println("Not eleigible for gold loan");
			}
		} else {
			System.out.println("Invalid details");
		}

	}
}
