package jelena.milivojevic;

public class Inkrement {

	public static void main(String[] args) {
		/*
		 * Neka je i = 3 i j = 4. Izračunaj: a) j = 3 + --i; b) j = 3 + i--; c) j = 3 +
		 * ++i; d) j = 3 + i++;
		 */
		// a)
		int i = 3, j = 4;
		System.out.println("Pod a)\ni = " + i + ", j = " + j);
		j = 3 + --i; // j = 3 + (i - 1) umanji i pa izračunaj
		System.out.println("i = " + i + "; j = " + j);

		// b)
		i = 3;
		j = 4;
		System.out.println("\nPod b)\ni = " + i + " j = " + j);
		j = 3 + i--; // j = 3 + i, i = i-i; tj. izračunaj pa umanji i
		System.out.println("i = " + i + " j = " + j);

		// c)
		i = 3;
		j = 4;
		System.out.println("\nPod c)\ni = " + i + " j = " + j);
		j = 3 + ++i; // j = 3 + (i + 1) uvećaj i pa izračunaj
		System.out.println("i = " + i + " j = " + j);

		// d)
		i = 3;
		j = 4;
		System.out.println("\nPod d)\ni = " + i + " j = " + j);
		j = 3 + i++; // j = 3 + i, i = i + i; tj. izračunaj pa uvećaj i
		System.out.println("i = " + i + " j = " + j);

	}

}
