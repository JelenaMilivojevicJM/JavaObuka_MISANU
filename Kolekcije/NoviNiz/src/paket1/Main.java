package paket1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int [] niz = new int[5];
		
	/*	for(int i = 0; i< niz .length; i++ ) {
			System.out.println("1. Niz Unesite broj: ");
			niz [i]= sc.nextInt();
			
			if((i+1)==niz.length) {
				System.out.println("1. Niz je napunjen!");
			}
		}
		
		System.out.println("Elementi 1. niza su: ");
		for(int i = 0; i< niz .length; i++ ) {
			System.out.println(niz[i]);
		}
		*/
		
		int [] niz = {1,2,3,4,5};
		System.out.println("Stampanje niza FOR-each petljom: ");
		for(int i: niz) {
			System.out.println(i);
		}
	
		/*System.out.println("Elementi 2. niza su: ");
		for(int i: niz) {
			System.out.println(niz[(i-1)]);
		}*/
		
	}

}//Sada ipak nece na ovaj nacin :)
