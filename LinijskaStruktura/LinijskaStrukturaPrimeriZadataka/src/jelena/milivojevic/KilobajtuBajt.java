package jelena.milivojevic;

import java.util.Scanner;

public class KilobajtuBajt {

	public static void main(String[] args) {
		/*
		 * Napisati program za pretvaranje veličine fajla izražene u kilobajtima u
		 * veličinu u bajtima.
		 */
		/*
		 * Tekstualni algoritam 1. ulaz: učitati veličinu u kilobajtima kb 2. obrada:
		 * izračunati veličinu u bajtima b = kb * 1024 3. izlaz: ispisati vrednost
		 * veličine u bajtima
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Pretvaranje veličine memorije iz kilobajta u bajte");
		System.out.println("Veličina datoteke u kilobajtima: ");
		int kb = input.nextInt();
		System.out.print("Veličina datoteke u bajtima: " + kb * 1024);
		input.close();
	}

}
