package paket;

//Kreiramo klasu FactoryProvider koja omogućava pristup implementacijama fabrika
public class FactoryProvider {
	public static <T> AbstractFactory<T> getFactory(String choice) {
		/*
		 * Metoda getFactory koristi generički tip <T> koji omogućava da se vrati
		 * instanca fabrike bilo kog tipa. getFactory metoda prima jedan argument choice
		 * koji predstavlja izbor fabrike koju želimo da dobijemo. U zavisnosti od
		 * vrednosti argumenta choice, metoda vraća instancu odgovarajuće fabrike. Ako
		 * je vrednost argumenta "Animal", metoda vraća instancu klase AnimalFactory.
		 * Ako je vrednost argumenta "Color", metoda vraća instancu klase ColorFactory.
		 * U oba slučaja, instanca fabrike se kastuje na tip AbstractFactory<T> pre nego
		 * što se vrati kao rezultat. Ako vrednost argumenta choice nije ni "Animal" ni
		 * "Color", metoda vraća null.
		 */

		// U zavisnosti od izbora, vraćamo instancu odgovarajuće fabrike
		if ("Animal".equalsIgnoreCase(choice)) {
			return (AbstractFactory<T>) new AnimalFactory();
		} else if ("Color".equalsIgnoreCase(choice)) {
			return (AbstractFactory<T>) new ColorFactory();
		}
		return null;
	}
}