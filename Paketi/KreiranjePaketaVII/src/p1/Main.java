package p1;
//Umesto import jedne kalse iz Javine biblioteke odnosno import java.util.Scanner; 
//Ubacili smo:
import java.util.*;
//Na ovaj nacin importujemo sve ono sto pripada toj biblioteci ukljucujuci i klasu koju trazimo (Scanner)

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r, a;
		System.out.println("Poluprecnik: ");
		r = sc.nextDouble();
		a = r*r*3.14;
		System.out.println("Povrsina kruga: "+a);
	}

}
