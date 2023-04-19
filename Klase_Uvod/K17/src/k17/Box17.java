package k17;

public class Box17 {
	private double width;
	private double heigth;
	private double depth;
	
	Box17() {
		width = 10;
		heigth = 10;
		depth = 10;
	}
	
	double volume() {
	return width * heigth * depth;
	}
}
