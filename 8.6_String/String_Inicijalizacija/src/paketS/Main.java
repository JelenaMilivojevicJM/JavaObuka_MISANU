package paketS;

public class Main {

	public static void main(String[] args) {
		// INICIJALIZACIJA STRINGA:

		// 1: Nova Promenljiva - Argument Konstruktora
		String str1 = new String("Jelena");
		System.out.println("Str1 : " + str1);

		// 2: Inicijalizacija postojecim stringom
		String str2 = new String(str1);
		System.out.println("Str2 : " + str2);

		// 3: Inicijalizacija ucitavanjem niza tipa char
		char nizCH[] = { 'J', 'A', 'V', 'A' };
		String str3 = new String(nizCH);
		System.out.println("Str3 : " + str3);

		// 4: Inicjalizacija podStringom
		String str4 = new String(nizCH, 1, 3);
		System.out.println("Str4 : " + str4);

		// 5: Klasicna dodela vrednosti
		String str5 = "Jelena";
		System.out.println("Str5 : " + str5);

		// 6. Konkatenacija u stampanju
		System.out.println("Konkatenacija: 5+5-> " + 5 + 5);
		System.out.println("Matematicki: (5+5)-> " + (5 + 5));

	}

}
