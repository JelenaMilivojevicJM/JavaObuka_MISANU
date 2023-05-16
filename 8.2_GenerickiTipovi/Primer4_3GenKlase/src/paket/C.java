package paket;

public class C<T, V> {

	T atribut1;
	V atribut2;

	C(T atribut1, V atribut2) {
		this.atribut1 = atribut1;
		this.atribut2 = atribut2;
	}

	public T getAtribut1() {
		return atribut1;
	}

	public void setAtribut1(T atribut1) {
		this.atribut1 = atribut1;
	}

	public V getAtribut2() {
		return atribut2;
	}

	public void setAtribut2(V atribut2) {
		this.atribut2 = atribut2;
	}

	public void prikaziTip() {
		System.out.println("Atribut Tipa T : " + atribut1 + ", " + atribut1.getClass().getName());
		System.out.println("Atribut Tipa V : " + atribut1 + ", " + atribut2.getClass().getName());
	}
}
