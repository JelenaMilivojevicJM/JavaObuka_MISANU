package pkt1;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		List<String> LList = new LinkedList<String>();

		LList.add("1");
		LList.add("2");
		LList.add("3");
		LList.add("4");
		LList.add("5");

		ListIterator litr = LList.listIterator();

		System.out.println("Kretanje kroz listu od prvog do poslednjeg elementa:");
		while (litr.hasNext()) {
			System.out.print(litr.next() + " ");
		}

		System.out.println("\nKretanje kroz listu od  poslednjeg do prvog elementa:");
		// Dokle god mu postoji prethodni
		while (litr.hasPrevious()) {
			System.out.print(litr.previous() + " ");
		}

	}

}
