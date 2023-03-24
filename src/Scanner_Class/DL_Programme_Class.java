package Scanner_Class;

import java.util.Scanner;

public class DL_Programme_Class {
	public static void main(String[] args) {
		String a;
		do {
			System.out.println("Enter your Birth Year = ");
			Scanner scr = new Scanner(System.in);
			int str = scr.nextInt();
			int age = 2022 - str;
			if (age >= 18) {
				if (age <= 70) {
					System.out.println("You are elligible for Driving Licence ");
				} else if (age > 70) {
					if (age <= 120) {
						System.out.println("You are too old for Driving Licence..Sorry !!");
					}				}
			} else if (age < 18) {
				if (age > 0) {
					System.out.println("You are not elligible for Driving Lincence");
				} else {
					System.out.println("You should birth at first..");
				}	}
			if (age >= 120) {
				System.out.println("You should death till now .....");
			}
			System.out.println("Do you want to cheak another ? press_yes.");
			a = scr.next();
		} while (a.equalsIgnoreCase("Yes"));
		System.out.println("Thank You !!");
	}
}
