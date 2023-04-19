package jelena.milivojevic;

public class Main {

	public static void main(String[] args) {
		int a = 15;
		int b = 20;

		Domine dom = new Domine(a, b);
		dom.prikazi();
		dom.zameni();
		dom.prikazi();
	}

}
