# Console-based Loan Application

## 📌 Project Description

A Java console-based Loan Application that evaluates customer eligibility for different types of loans based on personal details, salary, age, CIBIL score, and document validation.

## 🚀 Features

* Customer name and salary input
* Age and CIBIL score verification
* Mobile number validation
* Aadhaar number validation
* PAN number validation
* CIBIL-based interest rate calculation
* Gold Loan eligibility checking
* Home Loan eligibility checking
* Personal Loan eligibility checking

## 🏦 Loan Types

### Gold Loan

* Minimum salary: ₹7,00,000
* Age: 20–50 years
* CIBIL score: 300–900

### Home Loan

* Minimum salary: ₹8,00,000
* Age: 20–45 years
* CIBIL score: 300–900

### Personal Loan

* Minimum salary: ₹8,00,000
* Age: 20–60 years
* CIBIL score: 300–900

## 💰 Interest Rate

The interest rate is determined based on the customer's CIBIL score:

| CIBIL Score | Interest Rate |
| ----------- | ------------: |
| 300–549     |           13% |
| 550–649     |           12% |
| 650–749     |           11% |
| 750–899     |            8% |

## 🛠️ Technologies Used

* Java
* OOPs
* Inheritance
* Interface
* Method Overriding
* Regular Expressions
* Scanner

## 📂 Project Structure

```text
com.oops.inheritance
│
├── Loan.java
├── LoanImp.java
├── GoldLoan.java
├── HomeLoan.java
└── PersonalLoan.java
```

## 🔄 Working Flow

```text
Customer Details
       ↓
Document Validation
       ↓
Salary & Age Verification
       ↓
CIBIL Score Verification
       ↓
Interest Rate Calculation
       ↓
Loan Eligibility
       ↓
Approved / Rejected
```

## 🎯 Objective

The main objective of this project is to implement a simple loan eligibility system while demonstrating Java OOP concepts such as interfaces, inheritance, method overriding, and validation using regular expressions.

