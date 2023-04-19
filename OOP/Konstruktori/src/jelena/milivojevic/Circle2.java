package jelena.milivojevic;

public class Circle2 {
	private double radius;
	  
    Circle2(double rad) /* Konstrukor klase koji inicijalizuje jedan podatak. */
    {
      radius = rad;
    }

    public double area2() {
      return 3.14 * radius * radius;
    }
}
