package paket;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {
		 String imena[] = {"Mika", "Zika","Hana","Ana","Lana","Una"};
		 
		 List<String> ListaImena = new ArrayList<String>();
		 
		 //Smestanje niza u kolekciju:
		 for(String s : imena) {
			ListaImena.add(s);
		 }
		 
		 //Stampanje kolekcije
		 System.out.println("Kolekcija 1 upotrebom for-each petlje:");
		 for(String s : ListaImena) {
			 System.out.println(" "+s);
		 }

		//Koriscenje iteratora:
		 Iterator iter = ListaImena.iterator();
		 System.out.println("Kolekcija 1 pomocu Iteratora:");
		 
		 while(iter.hasNext()) {
			 System.out.println(iter.next()+" ");
		 }
		 
		 
		 //Niz i Kolekcija za brisanje
		 String brisanje[]= {"Mika","Hana","Lana"};
		 List<String> ZaBrisanje = new ArrayList<String>();
		
		 //Niz u kolekciju
		 for(String s : brisanje) {
			 ZaBrisanje.add(s);
		 }
		 System.out.println("Lista za brisanje:");
		 for(String s: ZaBrisanje) {
			 System.out.println(" "+s);
		 }
		
		 //Brisanje koriscenjem iteratora:
		 iter = ListaImena.iterator();
		 while(iter.hasNext()) {
			 if(ZaBrisanje.contains(iter.hasNext())) {
				 iter.remove();
			 }
		 }
		 
		 System.out.println("Kolekcija nakon brisanja: ");
		 for(int i = 0; i<ListaImena.size(); i++) {
				System.out.print(ListaImena.get(i)+" ");
				//Jer nemamo mogucnost za pristup pomocu [ ]  nego koristimo getter
			}
	}

}
