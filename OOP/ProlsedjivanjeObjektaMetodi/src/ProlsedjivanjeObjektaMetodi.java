package jelena.milivojevic;

public class ProlsedjivanjeObjektaMetodi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Krug k1 = new Krug(20);
		
		calcArea(k1);
	}
	
	public static void calcArea(Krug k) {
		System.out.println("Povrsina kruga: "+k.area());
	}

}
