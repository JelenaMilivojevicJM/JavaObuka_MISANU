package jelena.milivojevic;

import java.io.*;

public class VrednostFunkcijef {
	// Definisanje funkcije
	static int f(int x, int y, int z) {
		int f = (y < z) ? y : z;
		if (x > f)
			f = x;
		return f;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * Sastaviti algoritam i napisati metodu kojom se za zadate vrednosti x, y i z
		 * izračunava vrednost f po formuli f = max(x, min(y,z)). U glavnom programu
		 * uneti vrednosti za x, y i z i štampati rezultat.
		 */
		// Deklarisanje podataka
		int x, y, z;
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		// Unos podataka
		System.out.print("Unesite vrednost za x: ");
		x = Integer.parseInt(ulaz.readLine());
		System.out.print("Unesite vrednost za y: ");
		y = Integer.parseInt(ulaz.readLine());
		System.out.print("Unesite vrednost za z: ");
		z = Integer.parseInt(ulaz.readLine());
		// Štampanje rezultata
		System.out.println("Dobijena vrednost izraza f je " + f(x, y, z));
	}

}
