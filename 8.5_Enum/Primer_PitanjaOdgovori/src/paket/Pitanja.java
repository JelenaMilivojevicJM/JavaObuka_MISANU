package paket;

import java.util.Random;

public class Pitanja {

	Random rand = new Random();

	Odgovori odg() {

		int vrednost = (int) (rand.nextDouble() * 100);
	if(vrednost <15) {
		return Odgovori.MOZDA;
	}else if(vrednost<30) {
		return Odgovori.DA;
	} else if(vrednost<60) {
		return Odgovori.NE;
	} else if(vrednost<75) {
		return Odgovori.KASNIJE;
	}else if(vrednost<95) {
		return Odgovori.USKORO;
	}else {
		return Odgovori.NIKAD;
	}
	
	}
}
