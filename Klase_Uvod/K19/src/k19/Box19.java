package k19;

public class Box19 {
	private double width;
	private double heigth;
	private double depth;

	Box19(double width, double heigth, double depth) {
		this.width = width;
		this.heigth = heigth;
		this.depth = depth;
	}

	double volume() {
		return width * heigth * depth;
	}
}