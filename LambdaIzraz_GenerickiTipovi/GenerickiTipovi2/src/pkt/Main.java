package pkt;

public class Main {

	public static void main(String[] args) {
A<Integer, String> Objekat1 = new A<Integer, String>(100, "Java");
		Objekat1.prikaziTip();
		
		int intvrednost = Objekat1.getObj1();
		System.out.println("Vrednost Int: "+intvrednost);
		

		String svrednost = Objekat1.getObj2();
		System.out.println("Vrednost String: "+svrednost);
		
		A<String, Double> Objekat2 = new A<String, Double>("Tekst123",123.45);
		Objekat2.prikaziTip();
		
		String s2 = Objekat2.getObj1();
		System.out.println("Vrednost String: "+s2);
		double d = Objekat2.getObj2();
		System.out.println("Vrednost Double: "+d);
		
		
		A<Boolean, Integer> Objekat3 = new A<Boolean, Integer>(true,101);
		Objekat3.prikaziTip();
	
		Boolean b3 = Objekat3.getObj1();
		System.out.println("Vrednost Booelan: "+b3);
		
		int i3 = Objekat3.getObj2();
		System.out.println("Vrednost int: "+i3);
		
	}

}
