package paket;

public class A<T> {

	T x;

	A(T x) {
		this.x = x;
	}

	public void setC(T x) {
		this.x = x;
	}

	public T getX() {
		return x;
	}

	public void prikaziTip() {
		System.out.println("Objekat a ima vrednost: " + x + " i tip: " + x.getClass().getName());
	}
}
