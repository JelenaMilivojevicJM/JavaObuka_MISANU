package paketVezba;

public class Main {

	public static void main(String[] args) {
		TestiranjeBroja test1 = (n)->(n%2)==0;

		//Ispitivanje uslova
		if(test1.testBr(10)) {
			System.out.println("Broj je paran");
		}else {
			System.out.println("Broj je neparan");
		}
	}

}
