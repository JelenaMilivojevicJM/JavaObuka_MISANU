package sds;

public class Primer1 {
	/* */ /* */
	public static void main(String[] args) {
		// NACINI INICIJALIZACIJE STRINGA:
//Bilo koji niz bilo kojih karaktera.

		// promenljiva tipa string
		String str = "Jelena Milivojevic";
		System.out.println(str);
		/* Stringovi se predtsavljaju klasom STRING */
		/*
		 * Kreiranje STringa pomocu kljucne reci new: String str = new
		 * String("Utorak, 24.Januar");
		 */
		String str1 = new String("Utorak, 24.Januar");
		System.out.println(str1);

		// Inicijalizacija Stringa POSTOJECIM STRINGOM (kao argumentom)
		String s1 = "Podatak1";
		String s2 = new String(s1);
		System.out.println(s2);

		// inicijalizacija nizom char vrednosti
		char s3[] = { 'j', 'a', 'v', 'a' };
		System.out.println(s3);

		// Inicijalizacija podnizom
		String s4 = new String(s3, 1, 3);
		/*
		 * u zagrati kao argument ide podniz od koga uzimamo elemente , od kog do kog
		 * elemenat znaci s3 od 1 do 3
		 */
		System.out.println(s4);
	}

}
