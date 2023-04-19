package jelena.milivojevic_zadatak6;

public class OpisnaOcena <T,S>{

	T Ocena;
	S OpisnaOcena;
	
	OpisnaOcena(T Ocena, S OpisnaOcena){
		this.Ocena = Ocena;
		this.OpisnaOcena = OpisnaOcena;
	}

	public T getOcena() {
		return Ocena;
	}

	public void setOcena(T ocena) {
		Ocena = ocena;
	}

	public S getOpisnaOcena() {
		return OpisnaOcena;
	}

	public void setOpisnaOcena(S opisnaOcena) {
		OpisnaOcena = opisnaOcena;
	}
	
	void prikaziTip () {
		System.out.println("Tip za vrednost "+ Ocena +" je: "+Ocena.getClass().getName());
		System.out.println("Tip za vrednost " + OpisnaOcena+" je: "+OpisnaOcena.getClass().getName());
	}
	
}
