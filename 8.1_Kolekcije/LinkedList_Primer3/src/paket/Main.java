package paket;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {

		List LList = new LinkedList();

		LList.add("1");
		LList.add("2");
		LList.add("3");
		LList.add("4");
		LList.add("5");

		ListIterator itr = LList.listIterator();

		System.out.println("Kretanje kroz listu od prvod do poslednjeg elementa");
		while (itr.hasNext()) { // 0 .. n
			System.out.print(itr.next() + " ");
		}

		System.out.println("\nKretanje kroz listu od poslednjeg do prvog elementa");

		while (itr.hasPrevious()) { // 0
			System.out.print(itr.previous() + " ");
		}

	}
}
