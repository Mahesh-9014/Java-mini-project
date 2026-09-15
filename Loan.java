package com.oops.inheritance;

import java.util.Scanner;

public class Loan implements LoanInf {

	Scanner sc = new Scanner(System.in);

    public String getName() {
		System.out.println("Enter your name : ");
		String name = sc.nextLine();
		return name;
	}

	public double getSalary() {
		System.out.println("Enter your salary :");
		double salary = sc.nextDouble();
		return salary;
	}

	public int getAge() {
		System.out.println("Enter an age :");
		int age = sc.nextInt();
		return age;
	}

	public int cibil() {
		System.out.println("Enter a cibil score :");
		int cibil = sc.nextInt();
		return cibil;
	}

	public boolean isPhoneValid() {
		System.out.println("Enter your mobile number :");
		String num = sc.nextLine();
		boolean isValid = num.matches("^[6-9]{1}[0-9]{9}");
		return isValid;
	}

	public boolean isAadharValid() {
		System.out.println("Enter your aadhar :");
		String aadhar = sc.nextLine();
		boolean isAadhar = aadhar.matches("^[2-9]{1}[0-9]{11}");
		return isAadhar;
	}

	public boolean isPANValid() {
		System.out.println("Enter your PAN : ");
		String pan = sc.nextLine();
		boolean isPAN = pan.matches("^[A-Z]{5}[0-9]{4}[A-Z]{1}");
		return isPAN;
	}

	public double getRIT(int cibil) {
		double rit = 12.0;
		if (cibil >= 300 && cibil < 550) {
			System.out.println("Very low score,");
			return rit + 1;
		} else if (cibil >= 550 && cibil < 650) {
			System.out.println("Average score,");
			return rit;
		} else if (cibil >= 650 && cibil < 750) {
			System.out.println("Better score,");
			return rit - 1;
		} else if (cibil >= 750 && cibil < 900) {
			System.out.println("Excellent score,");
			return rit - 4;
		} else {
			return rit;
		}
	}
}
