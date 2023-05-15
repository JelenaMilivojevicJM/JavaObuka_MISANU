package paket_k4;

public class Box {
	private double width;
	private double heigth;
	private double depth;
	
	Box() {
		width = 10;
		heigth = 10;
		depth = 10;
	}
	
	double volume() {
	return width * heigth * depth;
	}
}
