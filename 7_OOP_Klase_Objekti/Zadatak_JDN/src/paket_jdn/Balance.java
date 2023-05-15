package paket_jdn;
public class Balance {
	String name; 
	double bal;
	
	Balance (String n, double b){
		name = n;
		bal = b;
	}
	
	void show() {

		if(bal <0) {
			System.out.print("U minusu: ");
		}
		System.out.println(name + " = "+bal);
	}
}
