package jelena.milivojevic;

import java.io.*;
import java.text.DecimalFormat;

public class CelicniStap {

	public static void main(String[] args) throws Exception {
		/*
		 * Čelični štap kvadratnog poprečnog preseka stranice A = 1cm, dužine L + 30cm,
		 * modula elastičnosti E + 2 * 10na4kN / cm2, pod dejstvom aksijalne sile F
		 * izduži se za Δ = 3,2 - 10 na-2cm, dok u poprečnom preseku nastaje kontrakcija
		 * Δa = 3 * 10na-4cm2. Sastaviti algoritam i napisati program za određivanje
		 * intenziteta aksijalne sile F i Poasonovog kofecijenta u.
		 */
		// A – površina poprečnog preseka štapa
		// L - dužina štapa
		// E - modul elastičnosti materijala
		// deltaL - izduženje štapa
		// deltaA - kontrakcija
		// F - intenzitet aksijalne sile
		// mi - Poasonov koeficijent
		double A, L, E, deltaL, deltaA, F, mi;
		DecimalFormat df = new DecimalFormat("#.##");
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		// Unos podataka
		System.out.print("Unesite vrednost površine poprečnog preseka štapa A: ");
		A = Double.parseDouble(ulaz.readLine());
		System.out.print("Unesite vrednost dužine štapa L (cm): ");
		L = Double.parseDouble(ulaz.readLine());
		System.out.print("Unesite vrednost modula elastičnosti E: ");
		E = Double.parseDouble(ulaz.readLine());
		System.out.print("Unesite vrednost izduženja štapa (cm): ");
		deltaL = Double.parseDouble(ulaz.readLine());
		System.out.print("Unesite vrednost kontrakcije (cm): ");
		deltaA = Double.parseDouble(ulaz.readLine());
		// Izračunavanje vrednosti intenziteta aksijalne sile i Poasonovog koeficijenta
		F = A * E * deltaL / L;
		mi = L * deltaA / (A * deltaL);
		// Štampanje rezultata
		System.out.println("Intenzitet aksijalne sile je F = " + df.format(F)
				+ "kN\nVrednost Poasonovog koeficijenta je " + df.format(mi));
	}

}
