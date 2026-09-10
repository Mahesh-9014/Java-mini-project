#Java-mini-project

package com.conditionalStatements;

import java.util.Scanner;

public class SwitchNestedDemo1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str1 = "";
		double sum = 0;

		do {
			System.out.println("Enter a type of food : ");
			String foodType = sc.nextLine();			

			switch (foodType) {
			case "veg":
				System.out.println("Enter a veg item : ");
				String item = sc.nextLine();
				System.out.println("Item price : ");
				double price1 = sc.nextDouble();
				sc.nextLine();

				switch (item) {
				case "tomato":
					System.out.println("1Kg Tomato : " + price1 + "rs");
					sum += price1;
					break;
				case "onion":
					System.out.println("1Kg Onion : " + price1 + "rs");
					sum += price1;
					break;
				case "potato":
					System.out.println("1Kg Potato : " + price1 + "rs");
					sum += price1;
					break;
				case "ginger":
					System.out.println("1Kg Ginger : " + price1 + "rs");
					sum += price1;
					break;
				default:
					System.out.println("Invalid veg item");
				}
				break;
			case "non-veg":
				System.out.println("Enter a non-veg item : ");
				String item2 = sc.nextLine();
				System.out.println("Item price : ");
				double price2 = sc.nextDouble();
				sc.nextLine();

				switch (item2) {
				case "chiken":
					System.out.println("1Kg Chicken : " + price2 + "rs");
					sum += price2;
					break;
				case "mutton":
					System.out.println("1Kg Mutton : " + price2 + "rs");
					sum += price2;
					break;
				case "fish":
					System.out.println("1Kg Fish : " + price2 + "rs");
					sum += price2;
					break;
				default:
					System.out.println("Invalid non-veg item");
				}
				break;
			case "fruits":
				System.out.println("Enter a fruit item : ");
				String item3 = sc.nextLine();
				System.out.println("Item price : ");
				double price3 = sc.nextDouble();
				sc.nextLine();

				switch (item3) {
				case "app":
					System.out.println("1Kg Apple : " + price3 + "rs");
					sum += price3;
					break;
				case "grape":
					System.out.println("1Kg Grape : " + price3 + "rs");
					sum += price3;
					break;
				case "orange":
					System.out.println("1Kg Orange : " + price3 + "rs");
					sum += price3;
					break;
				case "guava":
					System.out.println("1Kg Guava : " + price3 + "rs");
					sum += price3;
					break;
				default:
					System.out.println("Invalid fruit item");
				}
				break;
			default:
				System.out.println("Invalid foodtype");
			}
			System.out.println("Do you want to buy anyitem..?(y/n)");
			str1 = sc.nextLine();
		} while (str1.equalsIgnoreCase("y"));

		System.out.println("Total Bill : " + sum);

		sc.close();
	}

}
