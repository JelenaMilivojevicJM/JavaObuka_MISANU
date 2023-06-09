package jelena.milivojevic;

//import paketa util koji sadrzi klasu Scanner
import java.util.Scanner;

public class ScannerUpotreba {

	public static void main(String[] args) {
		// Unos podataka koriscenjem objekta klase Scanner

		// Objekat klase Scanner - sistemski ulaz
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite true ili false: ");
		boolean booleanValue = sc.nextBoolean();

		System.out.println("Unesite jednu rec: ");
		String stringValue = sc.next();

		System.out.println("Unesite broj za tip byte: ");
		byte byteValue = sc.nextByte();

		System.out.println("Unesite broj za tip int:");
		int intValue = sc.nextInt();

		System.out.println("Unesite broj za tip short:");
		short shortValue = sc.nextShort();

		System.out.println("Unesite broj za tip long:");
		long longValue = sc.nextLong();

		System.out.println("Unesite realni broj za tip float:");
		float floatValue = sc.nextFloat();

		System.out.println("Unesite realni broj za tip double:");
		double doubleValue = sc.nextDouble();

		// Izlaz:
		System.out.println("Uneli ste: ");
		System.out.println(booleanValue + ", " + stringValue + ", " + byteValue + ", " + intValue + ", " + shortValue
				+ ", " + longValue + ", " + floatValue + ", " + doubleValue + ". ");

		// Zatvaranje skenera
		sc.close();
	}

}
