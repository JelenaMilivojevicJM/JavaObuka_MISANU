package paket;

//Kreiramo konkretne klase koje implementiraju interfejs Animal
public class Dog implements Animal {
	@Override
	public String getAnimal() {
		// Vraćamo ime životinje
		return "Dog";
	}

	@Override
	public String makeSound() {
		// Vraćamo zvuk koji životinja proizvodi
		return "Barks";
	}
}