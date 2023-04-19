package Zadatak1;

import java.util.Scanner;

public class GlavnaKlasa_Cat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite ime macke: ");
		String uneto = sc.nextLine();

		Cat obj = new Cat();

		obj.setIme(uneto);

		obj.getIme();

		System.out.println("Ime macke je: " + obj.getIme());

		sc.close();
	}

}
