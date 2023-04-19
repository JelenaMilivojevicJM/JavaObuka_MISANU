package paket;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Staticki niz unutar koga unosimo elemente
		String imena[] = {"Mika","Zika","Ana","Lana","Hana","Una"};
		
		//Dimanicki niz - ArrayList 
		List<String> listaImena = new ArrayList<String>();
		
		//Prolazimo kroz staticki niz i smestamo ga u dinamicki niz(kolekciju):
		for(String s : imena) {
			listaImena.add(s);
		}
		
		//Kreiranje posebnog niza i posebne liste-kolekcije elemenata za brisanje 
		String ImenaZaBrisanje[] = {"Mika","Lana","Hana"};
		
		List<String> listaZaBrisanje = new ArrayList<String>();
		
		//Prebacivanje imena iz niza u novu kolekciju
		for(String s2 : ImenaZaBrisanje) {
			listaZaBrisanje.add(s2);
		}
		
		//ITERAROR interfejs - za prikazivanje sadrzaja cele liste
		//Da bismo koristiti iterator moramo koristiti odgovarajuci interfejs
		//Kreiranje iteratora kolekcije i stampanje liste pomocu iteratora:
		Iterator<String> iter = listaImena.iterator();
		
		//Stampanje pomocu iteratora:
		//Da li postoji sledeci element - Ako postoji onda je true
		//Uzece taj element pomocu ovog donjeg next metoda 
		System.out.println("Stampanje elemenata pomocu iteratora: ");
		while(iter.hasNext()) {
			System.out.print(iter.next()+ " ");
		}
		
		//Brisanje elemanata liste imena koja se nalaze u listi za brisanje
		iter = listaImena.iterator();
		while(iter.hasNext()) {
			if(listaZaBrisanje.contains(iter.hasNext())) {
				//Ako lista imena za brisanje sadrzi elemenet na koju ukazuje iterator
				iter.remove();
			}
			
		}
		
		System.out.println("\nLista nakon brisanja: ");
		for(int i = 0; i<listaImena.size(); i++) {
			System.out.print(listaImena.get(i)+" ");
			//Jer nemamo mogucnost za pristup pomocu [ ]  nego koristimo getter
		}
		
	}

}
