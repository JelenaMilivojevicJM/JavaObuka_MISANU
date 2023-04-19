package domine;

public class DomineMain {

	public static void main(String[] args) {

		Domine d1 = new Domine(2, 4);
		Domine d2 = new Domine(3, 4);

		System.out.println(d1.jednakost(d2));
		d1.okreni();
		System.out.println(d1.okreni());
		System.out.println(d1.opis());

	}
}
/*
 * System.out.println(d1.getA()+","+d1.getB()); d1.zamena();
 * System.out.println("Novi raspored polja "+d1.getA()+","+d1.getB());
 */

/*
 * public class Domine { private int a, b; // konstruktor Domine(int aa, int bb)
 * { // a = aa; b = bb; } public int getA() { return a; } public int getB() {
 * return b; } public Domine okreni() { int p = a; a = b; b = p; return this; }
 * public boolean ista(Domine d) { return a == d.a && b == d.b || b == d.a && a
 * == d.b; } public String tekstualniOpis() { return "(" + a + ", " + b + ")"; }
 */
