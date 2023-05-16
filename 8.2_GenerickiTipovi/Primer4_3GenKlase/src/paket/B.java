package paket;

public class B<T> {
	T y;

	B(T y) {
		this.y = y;
	}

	public void setY(T y) {
		this.y = y;
	}

	public T getY() {
		return y;
	}

	public void prikaziTip() {
		System.out.println("Objekat b ima vrednost : " + y + ", i tip: " + y.getClass().getName());
	}
}
