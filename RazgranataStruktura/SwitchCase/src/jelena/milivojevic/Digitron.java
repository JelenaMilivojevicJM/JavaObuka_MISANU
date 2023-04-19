package jelena.milivojevic;

import java.util.Scanner;

public class Digitron {

	public static void main(String[] args) {
		/*
		 * Napisati program koji se učita znak za operaciju (+,-,*,/) i dva realna
		 * operanda, a zatim štampa rezultat.
		 */
		double x, y;
		char operator;

		/* 1. deo: Unos podataka */
		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite željeni operator: ");
		operator = ulaz.next().charAt(0);
		System.out.println("Unesite operand x: ");
		x = ulaz.nextDouble();
		System.out.println("Unesite operand y: ");
		y = ulaz.nextDouble();

		/* 2. deo: Obrada podataka */
		System.out.println("Rešenje sa SWITCH:");
		switch (operator) {
		case '+':
			System.out.println("X + Y = " + (x + y));
			break;
		case '-':
			System.out.println("X - Y = " + (x - y));
			break;
		case '*':
			System.out.println("X * Y = " + (x * y));
			break;
		case '/':
			System.out.println("X / Y = " + (x / y));
		}
		ulaz.close();
	}

}
