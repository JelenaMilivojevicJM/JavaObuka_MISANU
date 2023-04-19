package pkt;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A<Integer> intObjekat = new A<Integer>(100);
		
		intObjekat.prikaziTip();
		int vrednostObjekta = intObjekat.getOb();
		System.out.println("Vrednost Int: "+vrednostObjekta);
		
		
		A<String> SObjekat = new A<String>("");
		SObjekat.prikaziTip();
		String vrednostSObjekta = SObjekat.getOb();
		System.out.println("Vrednost S: "+vrednostSObjekta);
		
	}

}
