package paket7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main7 {

	public static int racunajKolicnik(int imenilac, int brojilac) throws ArithmeticException {
	
		
		return brojilac/imenilac;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Unesite brojilac: ");
			int brojilac = sc.nextInt();
			System.out.println("Unesite imenilac: ");
			int imenilac = sc.nextInt();

		int rezultat = racunajKolicnik(imenilac,brojilac);
		System.out.println("Kolicnik =  "+rezultat);
		
		} catch (ArithmeticException e) { 
			System.out.println("Izuzetak: " + e); 
	}catch(InputMismatchException e ) {
		System.out.println("Nepoklapanje unosa sa tipom promenljive koja prihvata unos");
	}
/*	}catch(InputMismatchException e ) {
		System.out.println("Nepoklapanje unosa sa tipom promenljive koja prihvata unos");
}javlja gresku jer ne mogu postojati dva ista chatch bloka, osnpsnid dva sa istim paratemtrima*/
	}}