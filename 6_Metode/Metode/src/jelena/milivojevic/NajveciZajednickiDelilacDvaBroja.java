package jelena.milivojevic;

public class NajveciZajednickiDelilacDvaBroja {
	public static int nzd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return nzd(b, a % b);
		}
	}

	public static void main(String[] args) {
		// Najveci zajendicki delilac dva broja rekurzijom

		System.out.println("Najveci zajendicki delilac brojeva  18 i 30 = " + nzd(18, 30));
		// za 18 i 30 je broj 6
		System.out.println();
		System.out.println("Najveci zajendicki delilac brojeva 18 i 4 = " + nzd(18, 4));
		// za 18 i 4 je broj 2

		System.out.println();
	}

}
