package staticImport;

import java.util.*;

import static java.lang.Math.PI;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double r, a;
		System.out.println("Poluprecnik: ");
		r = sc.nextDouble();
			
		a = PI* r * r;// Staticka Konstanta PI iz Matematicke biblioteke
		System.out.println("Povrsina kruga: " + a);
	}

}
