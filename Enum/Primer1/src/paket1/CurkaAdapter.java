package paket1;

public class CurkaAdapter implements Patka{

	//1.Kreirati Interface tipa prema kome se vrsi prilagodjavanje - Interface tipa, to je onaj interface koji klijent ocekuje
	
	
	//2.Naopraviti objekat klase curka - DObiti referencu na objekat koji prilagodjavamo - Preko konstruktorra
	Curka curka;
	
	public CurkaAdapter(Curka curka) {
		this.curka = curka;
	}
	//3.Implememntirati metode zeljenog interface-a. 
	//Prevodjenje metode kvace u metodu curlice izmedju klasa.:
	
	public void kvace() {
		curka.curlice();
	}
	
	  public void leti() {
		  for(int i = 0; i<5; i++) {
		  curka.leti();
		  }
	  }
}
