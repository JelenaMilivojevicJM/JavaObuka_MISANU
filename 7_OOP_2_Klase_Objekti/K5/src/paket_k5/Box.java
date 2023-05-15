package paket_k5;

public class Box {
	private double width;
	private double heigth;
	private double depth;
	
	Box (double w, double h, double d) {
		width = w;
		heigth = h;
		depth = d;
	}
	
	double volume() {
		return width * heigth * depth;
		}
}