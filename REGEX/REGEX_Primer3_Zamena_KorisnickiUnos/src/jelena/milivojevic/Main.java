package jelena.milivojevic;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
//Primer kao Primer2 koriscenja rexeg-a, sa upotrebom korisnickog unosa
	public static void main(String[] args) {
		// Ulaz:
		Scanner sc = new Scanner(System.in);
		System.out.println("Upisite recenicu: ");
		String pocetnaRecenica = sc.nextLine();

		System.out.println("Upisite koju rec zelite da zamenite u Vasoj recenici: ");
		String obrazacZamene = sc.nextLine();

		System.out.println("Upisite koju rec zelite da stavite umesto te reci: ");
		String novaRec = sc.nextLine();

		// Obrada:
		Pattern obrazac = Pattern.compile(obrazacZamene);
		Matcher pretraga = obrazac.matcher(pocetnaRecenica);
		String izmenjenaRecenica = pretraga.replaceFirst(novaRec);

		// Izlaz:
		System.out.println("Pocetna recenica: ");
		System.out.println(pocetnaRecenica);
		// Stampanje recenice nakon zamene
		System.out.println("Izmenjena recenica: ");
		System.out.println(izmenjenaRecenica);

		sc.close();
		/*Primer prikaza izlaza u konzoli:
		 * Upisite recenicu: 
Mama sprema rucak
Upisite koiju rec zelite da zamenite u Vasoj recenici: 
rucak
Upisite koju rec zelite da stavite umesto te reci: 
veceru
Pocetna recenica: 
Mama sprema rucak
Izmenjena recenica: 
Mama sprema veceru */
	}

}
