package aaa;

public class TestGeometrijskaFigura {
	public static void main(String[] args) {
		Kvadrat[] k = new Kvadrat[3];
		k[0] = new Kvadrat(25.5);
		k[1] = new Kvadrat(10.5);
		k[2] = new Kvadrat(5.0);
		for (int i = 0; i < k.length; i++) {
			System.out.println("Površina " + i + ". kvadrata je " + k[i].izracunajPovrsinu());
			System.out.println("Obim " + i + ". kvadrata je " + k[i].izracunajObim());
		}
	}
}
