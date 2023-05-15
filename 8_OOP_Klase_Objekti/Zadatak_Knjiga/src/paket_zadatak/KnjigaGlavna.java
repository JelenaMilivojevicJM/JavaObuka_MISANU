package paket_zadatak;

import java.util.Scanner;

public class KnjigaGlavna {

	public static void main(String[] args) {
		// Ucitati Ime i broj stranica
		Scanner sc = new Scanner(System.in);
		Knjiga obj = new Knjiga();
		obj.imeIBroj();

		System.out.println("Unsite ime knjige");
		String unetoIme = sc.nextLine();
		System.out.println("Unsite broj stranica");
		int unetBr = sc.nextInt();

		obj.setime(unetoIme);
		obj.setbrojStranica(unetBr);
		obj.imeIBroj();

		sc.close();
	}

}