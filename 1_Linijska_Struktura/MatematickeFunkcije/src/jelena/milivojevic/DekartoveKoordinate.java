package jelena.milivojevic;

import java.io.*;
import java.text.DecimalFormat;

public class DekartoveKoordinate {

	public static void main(String[] args) throws Exception {
		/*
		 * Sastaviti algoritam i napisati program kojim se izračunavaju Dekartove
		 * koordinate sile inteziteta F = 6kN, ako je ugao α = 60° izmedju sile F i
		 * koordinate ose. Na izlazu štampati vrednost Dekartovih koordinata. Dekartove
		 * koordinate sile F na koordinatne ose određuju se izrazima X = F * cos α Y = F
		 * * sin α
		 */
		// f-intenzitet sile
		// alfa-ugao izmedju sile F i koordinatne ose
		// x,y-Dekartove koordinate
		double f, alfa, x, y;
		DecimalFormat df = new DecimalFormat("#.##");
		// Unos podataka
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite vrednost za intenzitet sile F(kN):");
		f = Double.parseDouble(ulaz.readLine());
		System.out.print("Unesite vrednost za ugao alfa u stepenima:");
		alfa = Math.toRadians(Double.parseDouble(ulaz.readLine()));
		// Izračunavanje vrednosti Dekartovih koordinata
		x = f * Math.cos(alfa);
		y = f * Math.sin(alfa);
		// Štampanje rezultata
		System.out.println("Vrednosti Dekartovih koordinata su: X=" + df.format(x) + "\tY=" + df.format(y));
	}

}
