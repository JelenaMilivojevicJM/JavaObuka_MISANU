package bezimporta;

public class Main {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		double r, a;
		System.out.println("Poluprecnik: ");
		r = sc.nextDouble();
		a = r * r * 3.14;
		System.out.println("Povrsina kruga: " + a);
		sc.close();
	}

}