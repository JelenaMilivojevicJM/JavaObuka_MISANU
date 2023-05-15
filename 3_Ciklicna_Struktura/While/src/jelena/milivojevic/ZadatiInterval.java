package jelena.milivojevic;

import java.util.Scanner;

public class ZadatiInterval {

	public static void main(String[] args) {
		/*
		 * Napisati program koji za date prirodne brojeve a i b ispisuje brojeve iz
		 * intervala [a, b], od kojih je prvi broj koji se ispisuje jednak a, a svaki
		 * sledeći četiri puta veći od prethodnog. Na primer, [a, b] = [5, 100] treba
		 * ispisati 5, 20, 80
		 */
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite vrednostza a:");
		int a = ulaz.nextInt();
		System.out.println("Unesite vrednostza b:");
		int b = ulaz.nextInt();
		while (a <= b) {
			System.out.println(a);
			a *= 4;
		}
		ulaz.close();
	}

}
