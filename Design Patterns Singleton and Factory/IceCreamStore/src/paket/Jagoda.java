package paket;

//Konkretna klasa koja nasleđuje apstraktnu klasu Sladoled i implementira metodu pripremi()
public class Jagoda extends Sladoled {
	@Override
	public void pripremi() {
		System.out.println("Pripremanje sladoleda od jagode . . .");
	}
}
