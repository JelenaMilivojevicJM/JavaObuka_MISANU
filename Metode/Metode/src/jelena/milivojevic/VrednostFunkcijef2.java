package jelena.milivojevic;

import java.text.DecimalFormat;

public class VrednostFunkcijef2 {
	static double fun(double x, double y) {
		double f;
		if (x < y)
			f = Math.exp(x) + Math.sin(2 * y);
		else if (x == y)
			f = Math.cos(x);
		else
			f = 1 - Math.sqrt(Math.abs(x * y));
		return f;
	}

	public static void main(String[] args) {
		/*
		 * Napisati metodu u kojoj se za zadate vrednosti x = 0.2(0.1)0.5 i y =
		 * 0.1(0.1)0.7 izračunava vrednost funkcije F(x, y)
		 */
		DecimalFormat df = new DecimalFormat("#.##");

		System.out.println("\tX\tY\tF(X, Y)");

		for (double x = 0.1; x <= 0.5; x += 0.1)
			for (double y = 0.01; y <= 0.03; y += 0.01)
				System.out.println("\t" + df.format(x) + "\t" + df.format(y) + "\t" + df.format(fun(x, y)));
	}

}
