package jelena.milivojevic;

public class Faktorijel {

	public static void main(String[] args) {
		// Faktorijel broja 5:
		System.out.print("WHILE : ");
		int fakW = 1;
		int i = 5;
		while (i > 0) {
			fakW *= i;
			i--;
		}
		System.out.println(fakW);

	}

}
