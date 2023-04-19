package pkt1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Brojevi {

	List <Integer> Brojevi = new ArrayList<Integer>();
	
	//Omogucavanje unosenja elemenata sa tastature:
	Scanner sc = new Scanner(System.in);
	void unosBrojeva() {
		System.out.println("Unesite brojeve. Za prekid unosa unesite -1");
		
		while(true) {
			System.out.println("Broj ");
			int uneto = sc.nextInt();
			if(uneto == -1) {
				return;
			}
			//Unosenje elemenata u kolekciju
			this.Brojevi.add(uneto);
		}
		
	}
	
	//Ispis niza
	void ispis() {
		System.out.println("Brojevi: ");
		System.out.println(this.Brojevi);
	}
}
