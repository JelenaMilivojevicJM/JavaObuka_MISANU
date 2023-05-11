package paket;

//Implementiramo fabriku ColorFactory koja koristi Factory Method pattern
public class ColorFactory implements AbstractFactory<Color> {
	@Override
	public Color create(String colorType) {
		// U zavisnosti od boje životinje, instanciramo odgovarajuću klasu
		if ("White".equalsIgnoreCase(colorType)) {
			return new White();
		} else if ("Blue".equalsIgnoreCase(colorType)) {
			return new Blue();
		}
		return null;
	}
}
