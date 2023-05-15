package paket2;
import paket1.Balance;
public class BalanceMain {

	public static void main(String[] args) {
		// Kreiranje niza objekata 
		Balance objekat[] = new Balance[3];

		//Definisanje pojedinacnih elemenata objekta:
		
		objekat[0]= new Balance("Mika",123.45);
		objekat[1] = new Balance("Zika",345.12);
		objekat[2]= new Balance("Ljubivoje",-12.34);
		
		//Stampanje niza + Pozivanje metode
		for(int i = 0; i< 3; i++) {
			objekat[i].show();
		}	
	}

}

