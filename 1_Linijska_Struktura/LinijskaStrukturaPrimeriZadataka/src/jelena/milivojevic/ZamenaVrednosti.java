package jelena.milivojevic;

import java.util.Scanner;

public class ZamenaVrednosti {

	public static void main(String[] args) {
		/*
		 * Napisati program koji izvodi zamenu vrednosti dva broja korišćenjem
		 * privremene promenljive.
		 */
		int x, y;
		int temp; // privremena promenljiva

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite x ");
		x = input.nextInt();
		System.out.println("Unesite y ");
		y = input.nextInt();
		System.out.println("Pre zamene \nx = " + x + "\ny = " + y);
		temp = x; // temp - privremena promenljiva
		x = y; // x može primiti novu vrednost jer je kopija u temp
		y = temp; // y prima vrednost od temp
		System.out.println("Posle zamene\nx = " + x + "\ny = " + y);
		input.close();
	}

}
