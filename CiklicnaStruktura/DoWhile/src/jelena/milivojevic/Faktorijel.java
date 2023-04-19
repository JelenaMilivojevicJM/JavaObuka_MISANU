package jelena.milivojevic;

public class Faktorijel {

	public static void main(String[] args) {
		// Faktorijel broja 5:
		System.out.print("DO-WHILE : ");
		int fakD = 1;
		int j = 5;
		do {
			fakD *= j;
			j--;
		} while (j > 0);
		System.out.println(fakD);

	}

}
