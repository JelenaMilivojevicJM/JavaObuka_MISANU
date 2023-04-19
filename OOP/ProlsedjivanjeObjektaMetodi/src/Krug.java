package oop8;

public class Krug {

	private double radius;
	
	Krug(){
		radius = 0.0;
	}
	
	Krug(double radius){
		this.radius=radius;
	}
	
	public double area() {
		return 3.14*radius*radius;
	}
	
}
