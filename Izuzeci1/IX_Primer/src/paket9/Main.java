package paket9;

public class Main {

	public static void main(String[] args) {
		Sporedna s = new Sporedna();
		
		try {
			s.procA();
		}catch(Exception e) {
			System.out.println("Izuzetak uhvacen. "+e);
		}
		s.procB();
		s.procC();
		

	}

}
