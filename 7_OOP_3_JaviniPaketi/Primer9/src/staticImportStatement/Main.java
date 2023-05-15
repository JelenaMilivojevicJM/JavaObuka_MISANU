package staticImportStatement;

import static java.lang.Math.*;//STATIC IMPORT + importovana CELA matematicka biblioteka

public class Main {

	public static void main(String[] args) {
		double a = 3.0;
		double b = 4.0;
		double c = 1;
		c = sqrt(a * a + b * b);
		System.out.println("C = " + c);

	}

}
