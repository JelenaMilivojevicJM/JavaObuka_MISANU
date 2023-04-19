package jelena.milivojevic;

public class DvaNovaNiza2 {

	public static void main(String[] args) {
		/*
		 * Poštar ide ulicom i treba da rasporedi pošiljke. Odlučio je da prvo obiđe
		 * jednu stranu ulice (na kojoj su kuće sa parnim brojevima), a da u povratku
		 * obiđe drugu stranu ulice (na kojoj su kuće sa neparnim brojevima). Napisati
		 * program koji za unete brojeve kuća određuje koje su na parnoj, a koje na
		 * neparnoj strani ulice.
		 */
		// Niz parnih i niz neparnih brojeva i njihove trenutne dužine
		// Niz parnih i niz neparnih brojeva i njihove trenutne dužine
		// Niz parnih i niz neparnih brojeva i njihove trenutne dužine
		int niz[] = { 10, 12, 15, 17, 20 };

		System.out.print("Brojevi kuca: ");
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
		System.out.println();

		int nizP[] = new int[10];
		int brojacP = 0;
		int nizNP[] = new int[10];
		int brojacNP = 0;

		for (int i = 0; i < niz.length; i++) {
			if (niz[i] % 2 == 0) {
				brojacP++;
				nizP[brojacP] = niz[i];
			}

			if (niz[i] % 2 != 0) {
				brojacNP++;
				nizNP[brojacNP] = niz[i];
			}
		}
		System.out.print("Parni: ");
		for (int i = 1; i <= brojacP; i++) {
			System.out.print(nizP[i] + " ");
		}
		System.out.println();
		System.out.print("Neparni: ");
		for (int i = 1; i <= brojacNP; i++) {
			System.out.print(nizNP[i] + " ");
		}
		System.out.println();

	}

}
