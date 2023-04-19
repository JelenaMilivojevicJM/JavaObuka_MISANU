package paket1;

public class Balance {
	//Atributi
	String ime;
	double balance;
	
	//Parametrizovan Konstruktor
	public Balance(String ime, double balance){
		this.ime = ime;
		this.balance = balance;
	}
	
	//Metoda Objekta
	public void show() {
		System.out.println("Korisnik: "+ime+","+balance);
		if(balance < 0) {
			System.out.println("*Korisnik je un minusu! ");
		}
	}

}
