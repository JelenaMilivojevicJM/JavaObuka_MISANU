package jelena.milivojevic;

public class Circle1 {

	private double poluprecnik;

    Circle1() {
      poluprecnik = 10.0;
    }
    /* poluprecnik ima vrednost 10, koja je postavljena u konstruktoru 
    * prilikom kreiranja objekta */

    /* Ako se ne navede konstruktor, kompajler postavlja defaultne vrednosti */

    public double area() {
      return 3.14 * poluprecnik * poluprecnik;
    }
}
