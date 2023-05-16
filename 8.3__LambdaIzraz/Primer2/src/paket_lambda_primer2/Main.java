package paket_lambda_primer2;

public class Main {
	public static void main(String[] args) {
		/*
		 * Napisati Lambda izraz koji ispituje da li je jedan broj deljiv drugim brojem.
		 */

		TestDeljivosti br = (n, m) -> (n % m) == 0;

		if (br.test(4, 2)) {
			System.out.println("Broj 4 je deljiv brojem 2");
		} else {
			System.out.println("Broj 4 nije deljiv brojem 2");
		}

		if (br.test(7, 2)) {
			System.out.println("Broj 7 je deljiv brojem 2");
		} else {
			System.out.println("Broj 7 nije deljiv brojem 2");
		}
	}

}
