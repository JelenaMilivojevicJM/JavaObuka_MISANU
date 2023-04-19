package predavanje22;

public class MainTacka {
	
	public static void main(String[] args) {
		
		Tacka t1 = new Tacka(); // (0,0)
		Tacka t2 = new Tacka(5); //(5,0)
		Tacka t3 = new Tacka(2, 2);
		
		System.out.println("Rastojanje od koordinatnog pocetka tacke t1: " + t1.poteg());
		System.out.println("Rastojanje od koordinatnog pocetka tacke t2: " + t2.poteg());
		System.out.println("Rastojanje od koordinatnog pocetka tacke t3: " + t3.poteg());
		System.out.println("***");
		System.out.println("Rastojanje tacke t1 od tacke t3: " + t1.Rastojanje(t3));
		System.out.println("Rastojanje tacke t1 od tacke t2: " + t1.Rastojanje(t2));
		System.out.println("***");
		System.out.println("Rastojanje tacke t2 od tacke t1: " + t2.Rastojanje(t1));
		System.out.println("Rastojanje tacke t2 od tacke t3: " + t2.Rastojanje(t3));
		System.out.println("***");
		System.out.println("Rastojanje tacke t3 od tacke t1: " + t3.Rastojanje(t1));
		System.out.println("Rastojanje tacke t3 od tacke t2: " + t3.Rastojanje(t2));
	}
}
