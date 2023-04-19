package k18;

public class Box18 {
	private double width;
	private double heigth;
	private double depth;
	
	Box18 (double w, double h, double d) {
		width = w;
		heigth = h;
		depth = d;
	}
	
	double volume() {
		return width * heigth * depth;
		}
}
