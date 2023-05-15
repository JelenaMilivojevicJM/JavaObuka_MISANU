package jelena.milivojevic;

import java.util.Scanner;
import java.text.DecimalFormat;

public class AritmetickaSredina {

	public static void main(String[] args) {
		/*Napisati program za izračunavanje aritmetičke sredine unetih brojeva. */
		// Deklaracija promenljivih
        double imenilac, brojilac = 0d;
    
        DecimalFormat df = new DecimalFormat("#.##");
        Scanner ulaz = new Scanner(System.in);
    
        // 1. Unos podataka
        System.out.println("Koliko cifara zelite da unesete? ");
        imenilac = ulaz.nextDouble();
    
        // 2. Obrada podataka primenom for petlje
        for (int i = 1; i <= imenilac; i++) {
            System.out.println("Unesite " + i + ". cifru: ");
            double j = ulaz.nextDouble();
            brojilac += j;
        }
    
        // Stampanje izlaznog rezultata
        System.out.println("Aritmeticka sredina je " + df.format((brojilac / imenilac)));
        ulaz.close(); // Zatvarenja skenera kako bi se izbeglo "curenje" podataka
	}

}
