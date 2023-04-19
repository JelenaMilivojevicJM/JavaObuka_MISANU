package paket_DZ2_2zad_JelenaMilivojevic;

public class Main {

	public static void main(String[] args) {
		
		 Student s = new Student("Mika Mikic", 20210001);
	        s.dodajIspit(new Ispit("MT", new Ocena(8)));
	        s.dodajIspit(new Ispit("OP", new Ocena(7)));
	        s.dodajIspit(new Ispit("OI", new Ocena(9)));
	        System.out.println(s);
	}

}
