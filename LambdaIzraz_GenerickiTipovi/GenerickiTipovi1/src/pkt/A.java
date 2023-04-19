package pkt;

public class A <T> {

	//Genericka klasa.
	//T je paramtar tipa koji ce biti zamenjen  stvarnim tipom kada se naparavi objekat tipa A
 
	T ob; 
 
	A (T o){
		ob = o;
	}
	
	public void setOb(T ob ) {
		this.ob = ob;
	}
	
	public T getOb() {
		return ob;
	}
	
	void prikaziTip() {
		System.out.println("Tip T je: "+ob.getClass().getName());
	}
}
