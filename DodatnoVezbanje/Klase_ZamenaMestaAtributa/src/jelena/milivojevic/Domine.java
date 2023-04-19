package jelena.milivojevic;

public class Domine {

	int a;
	int b;

	Domine(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	// METODA za zamenu:
	public Domine zameni() {
		int temp = a;
		a = b;
		b = temp;
		return this;
	}

	// Metoda za prikaz
	public void prikazi() {
		System.out.println("a = " + a + ", b = " + b);
	}
}
