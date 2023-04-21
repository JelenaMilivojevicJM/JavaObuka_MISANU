package jelena.milivojevic;

import java.util.HashMap;
import java.util.Map;

public class Main {
	/*
	 * Teorijsko Objasnjenje kolekcije Map: Mapa je interfejs u okviru Java
	 * kolekcija koji obezbeđuje funkcionalnost strukture podataka mape. Map
	 * kolekcije su strukture podataka u programskom jeziku Java koje omogućavaju
	 * pohranjivanje parova ključ/vrednost. Indexi moraju biti jedinstveni, dok
	 * vrednosti mogu biti duplirane. Postoje različite implementacije Map kolekcija
	 * kao što su HashMap, TreeMap i LinkedHashMap. Svaka od njih ima svoje
	 * specifičnosti u pogledu redosleda elemenata, performansi i načina sortiranja.
	 * 
	 * Neke od uobičajenih metoda za Map kolekcije u programskom jeziku Java su: 1.
	 * put(K key, V value) - dodaje par ključ/vrednost u mapu 2. get(Object key) -
	 * vraća vrednost povezanu sa zadatim ključem 3. remove(Object key)- uklanja par
	 * ključ /vrednost povezan sa zadatim ključ 4. containsKey(Object key) -
	 * proverava da li mapa sadrži zadati ključ 5. containsValue(Object value) -
	 * proverava da li mapa sadrži zadatu vrednost 6. size() - vraća broj parova
	 * ključ /vrednost u mapi 7. isEmpty() - proverava da li je mapa prazna
	 */
	public static void main(String[] args) {
		// Jednostavan primer primene:
		/*
		 * Sledi kod programa koji: kreira novu HashMap kolekciju koja unosi parove
		 * ključ/vrednost, gde su ključevi tipa String a vrednosti tipa Integer. Zatim
		 * se dodaju tri elementa u mapu koristeći put() metodu. Prikazujemo vrednost
		 * povezanu sa zadatim ključem koristeći get() metodu. Zatim primenjujemo
		 * korišćenje containsValue(),containsKey(),size(), metode. Zatim se prikazuju
		 * svi elementi mape koristeći for petlju i entrySet metodu. Potom brisemo jedan
		 * element. I na kraju ponovo prikaz cele kolekcije nakon pomenute izmene.
		 */

		// Kreiranje mape
		Map<String, Integer> mapVoce = new HashMap<String, Integer>();

		// Dodavanje elemenata u mapu
		mapVoce.put("Jabuka", 100);
		mapVoce.put("Banana", 200);
		mapVoce.put("Narandža", 300);
		mapVoce.put("Kruška", 400);

		// Metoda get(Object key)- vraća vrednost povezanu sa zadatim ključem
		int value = mapVoce.get("Banana");
		System.out.println("Vrednost za ključ 'Banana' je: " + value);
		System.out.println("-------------------------");
		// Korišćenje containsValue() metode
		boolean result1 = mapVoce.containsValue(200);
		System.out.println("Da li mapa sadrži vrednost 200: " + result1);
		System.out.println("-------------------------");
		// Korišćenje containsKey() metode
		boolean result2 = mapVoce.containsKey("Banana");
		System.out.println("Da li mapa sadrži ključ 'Banana': " + result2);
		System.out.println("-------------------------");
		// Korišćenje size() metode
		int size = mapVoce.size();
		System.out.println("Broj elemenata u mapi: " + size);
		System.out.println("-------------------------");
		// Prikazivanje svih elemenata mape
		for (Map.Entry<String, Integer> entry : mapVoce.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		System.out.println("-------------------------");
		// Korišćenje remove metode
		mapVoce.remove("Banana");

		// Prikazivanje elemenata mape nakon uklanjanja elementa
		System.out.println("Elementi mape nakon uklanjanja elementa 'Banana':");
		for (Map.Entry<String, Integer> entry : mapVoce.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		System.out.println("-------------------------");

	}
}
