package p2;

public class OtherPackage {

	OtherPackage() {
		
		p1.Base p = new p1.Base();
		
		System.out.println("Konstruktor klase OtherPackage.");
		// System.out.println("OtherPackage Klasa n_pri = "+b.n_pri);
		//System.out.println("OtherPackage Klasa n_def = " + b.n_def);
		//System.out.println("OtherPackage Klasa n_pro = " + b.n_pro);
		System.out.println("OtherPackage Klasa n_pub = " + p.n_pub);

	}
}
