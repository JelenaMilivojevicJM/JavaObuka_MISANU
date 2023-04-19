package paket;

public class Test {
	public static void main(String[] args) {
		HonorarniTaksista ht = new HonorarniTaksista();
		ht.zadajIme("Žika");
		System.out.println(ht.uzmiIme());
		ht.zadajHonorarneSate(20);
		System.out.println(ht.uzmiHonorarneSate());
	}
}