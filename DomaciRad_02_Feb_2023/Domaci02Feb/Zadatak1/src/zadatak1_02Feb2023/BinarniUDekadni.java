package zadatak1_02Feb2023;

import java.util.Scanner;

public class BinarniUDekadni {

	public static int konvertujUDekadni(int bin){
		 
	    int dekadni = 0;
	    int brojac = 0;
	    while(true){
	      if(bin == 0){
	        break;
	      } else {
	          int pomocna = bin%10;
	          dekadni += pomocna*Math.pow(2, brojac);
	          bin = bin/10;
	          brojac++;
	       }
	    }
	    return dekadni;
	  }
	
	public static void main(String[] args) {
		/*TEXT ZADATKA: 1. Napisati program koji pretvara binarni u dekadni broj. */

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite binarni broj: ");
		int binarni = sc.nextInt();
		
		System.out.println("Rezultat : "+konvertujUDekadni(binarni));
		
		sc.close();
	}

}
