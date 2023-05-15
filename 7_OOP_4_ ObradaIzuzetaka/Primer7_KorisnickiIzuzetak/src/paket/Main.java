package paket;

public class Main {

	public static void checkAge(int age) throws Obicna{
		System.out.println("Checing Age Validity:("+age+")");
		if (age < 0 || age > 100) {
			throw new Obicna(age);
			}
		System.out.println("Age: "+age+" is a valis age. ");
	}
	
	public static void main(String[] args) {
	
		try {
			checkAge(25);
			checkAge(-5);
		} catch(Obicna e) {
			System.out.println("Caught: "+e);
		} finally {
			System.out.println("Finally block");
		}

	}

}