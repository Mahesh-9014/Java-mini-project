package com.oops.inheritance;

public class PersonalLoan extends LoanInf {
	
	void personalLoanDocInfo() {
		System.out.println("Personal Loan Info!!!");
	}

	public static void main(String[] args) {
		
		PersonalLoan p = new PersonalLoan();
		String name = p.getName();
		System.out.println("Welcome to SBI PersonalLoan!! Mr." + name);
		
		if (p.isPhoneValid() && p.isAadharValid() && p.isPANValid()) {

			double salary = p.getSalary();
			int age = p.getAge();
			int cibil = p.cibil();
			double interest = p.getRIT(cibil);
			if (salary >= 800000.00 && (age >= 20 && age <= 60) && (cibil >= 300 && cibil <= 900)) {
				System.out.println("And you are eligible for personal loan with interest of : " + interest + "%");
			} else {
				System.out.println("Not eleigible for personal loan");
			}
		} else {
			System.out.println("Invalid details");
		}

	}

}
