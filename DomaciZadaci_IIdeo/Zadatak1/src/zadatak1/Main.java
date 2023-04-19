package zadatak1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Ulaz:
		// Ucitavanje vrednosti promenljivih a, b i c
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite vrednost za a: ");
		double a = sc.nextDouble();
		System.out.println("Unesite vrednost za b: ");
		double b = sc.nextDouble();
		System.out.println("Unesite vrednost za c: ");
		double c = sc.nextDouble();

		// Obrada:
		// Racunanje funcije f
		double f = (a-b)/(c+a/(c+b/(c-b)));
		
		
		// Racunanje funcije g
		double g = (a+b+Math.sin(a))*Math.cos(c);
		
		// Racunanje zbira funcija f i g
		double zbir = f+g;
		
		// Racunanje razlike funcija f i g
		double razlika = f - g;
		
		//Izlaz:
		//Stampanje vrednosti
		System.out.println("Vrednost funcije f = "+f);
		System.out.println("Vrednost funcije g = "+g);
		System.out.println("Zbir vrednosti funkcija f + g  = "+zbir);
		System.out.println("Razlika vrednosti funkcija f - g  = "+razlika);
		
		sc.close();

	}

}
