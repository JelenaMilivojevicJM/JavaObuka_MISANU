package objedinjeni;

public class Box20 {
	private double width;
	private double heigth;
	private double depth;

	Box20() {
		width = 1;
		heigth = 1;
		depth = 1;
	}

	Box20(double w, double h, double d) {
		width = w;
		heigth = h;
		depth = d;
	}

	Box20(double len) {
		width = heigth = depth = len;
	}

	Box20(Box20 b) {
		width = b.width;
		heigth = b.heigth;
		depth = b.depth;
	}

	double volume() {
		return width * heigth * depth;
	}
}
