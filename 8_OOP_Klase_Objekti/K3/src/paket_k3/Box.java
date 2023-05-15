package paket_k3;

public class Box {
	private double width;
	private double heigth;
	private double depth;

	void initBox16(double w, double h, double d) {
		width = w;
		heigth = h;
		depth = d;
	}

	double volume() {
		return width * heigth * depth;
	}
}
