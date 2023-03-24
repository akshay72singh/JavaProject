package Var_Arg;

import java.util.Scanner;

public class Calculator {

	public static void add(double x, double y) {
		double h = x + y;
		System.out.println(h);
	}

	public static void min(double a, double b) {
		double n = a - b;
		System.out.println(n);

	}

	public static void mult(double a, double b) {
		double m = a * b;
		System.out.println(m);

	}

	public static void bhag(double a, double b) {
		double m = a / b;
		System.out.println(m);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double p = sc.nextDouble();
		String operator = sc.next();
		double d = sc.nextDouble();

		switch (operator) {
		case "+": {
			add(p, d);
			break;
		}
		case "-": {
			min(p, d);
			break;
		}
		case "*": {
			mult(p, d);
			break;
		}
		case "/": {
			bhag(p, d);
			break;
		}
		default: {
			System.out.println("invailid operator");
			break;
		}
		}

	}

}
