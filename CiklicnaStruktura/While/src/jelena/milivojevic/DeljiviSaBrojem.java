package jelena.milivojevic;

import java.util.Scanner;

public class DeljiviSaBrojem {

	public static void main(String[] args) {
		/*
		 * Napisati program za ispisivanje brojeva od 1 do zadatog broja n koji su
		 * deljivi sa a.
		 */
		Scanner ulaz = new Scanner(System.in);
		int a, n, i = 1;
		System.out.println("Unesite vrednost za n:");
		n = ulaz.nextInt();
		System.out.println("Unesite vrednost za a:");
		a = ulaz.nextInt();
		while (i <= n) {
			if (i % a == 0)
				System.out.println(i);
			i++;
		}
		ulaz.close();
	}

}
