package paket;

//Implementiramo fabriku AnimalFactory koja koristi Factory Method pattern
public class AnimalFactory implements AbstractFactory<Animal> {
	@Override
	public Animal create(String animalType) {
		// U zavisnosti od tipa životinje, instanciramo odgovarajuću klasu
		if ("Dog".equalsIgnoreCase(animalType)) {
			return new Dog();
		} else if ("Duck".equalsIgnoreCase(animalType)) {
			return new Duck();
		}
		return null;
	}
}