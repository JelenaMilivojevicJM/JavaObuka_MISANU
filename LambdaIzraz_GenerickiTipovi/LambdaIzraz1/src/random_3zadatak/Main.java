package random_3zadatak;
import java.lang.Math;
import java.text.DecimalFormat;
public class Main {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.###");
		
		//Kreiranje promenljive i upotreba lambda izraza:
		Random broj = (n)-> Math.random();
		
		//Pozivanje metode i Stanmpanje rezultata:
		System.out.println("Random broj: "+df.format(broj.randomBr(Math.random())));
	}

}
