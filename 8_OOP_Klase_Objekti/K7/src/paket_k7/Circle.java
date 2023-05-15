package paket_k7;

public class Circle {
private double radius;
	
	//Konst bez parametara
	Circle(){
		radius = 0.0;
	}
	
	//Konst sa parametrom
	Circle(double rad){
		this.radius = rad;
	}
	
	//Konst sa obj kao par
	Circle(Circle ob){
		radius = ob.radius; //Inicijalizacija atributa objekta klase
	}
	
	//Metoda objekta
	public double area() {
		return 3.14*radius*radius;
	}
}
