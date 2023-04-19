package paket10;

public class Obicna extends Throwable {
	private int age;
	
	Obicna(int a){
		age = a;
	}
	
	public String toString() {
		return "Age: "+age+" is not a valid age.";
	}
	

}
