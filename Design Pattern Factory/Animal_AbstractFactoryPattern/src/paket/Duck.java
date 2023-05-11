package paket;

//Kreiramo konkretne klase koje implementiraju interfejs Animal
public class Duck implements Animal {
	@Override
	public String getAnimal() {
		// Vraćamo ime životinje
		return "Duck";
	}

	@Override
	public String makeSound() {
		// Vraćamo zvuk koji životinja proizvodi
		return "Squeaks";
	}
}