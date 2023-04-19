package paket_fajl1;

import java.io.File;

public class UcitavanjeFajla {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\jelen\\OneDrive\\Desktop\\Dokument.java");
		
		//1.Ime
		System.out.println(" Ime fajla : "+f.getName());
		
		//2. Da li je fajl
		System.out.println(" Da li je fajl : "+f.isFile());
		
		//3.Apsolutna putanja
		System.out.println(" Apsolutna putanja: "+f.getAbsolutePath());

		//4.da li postoji 
		System.out.println(" Da li postoji: "+(f.exists()?" DA ":" NE "));
		
		//5.da li je direkytorijum ili fajl
		System.out.println(" Direktorijum/ File : "+(f.isDirectory()?" Directorium ":" File"));


		//6.Moze li se citati iz njega
		System.out.println(" Moze biti procitan: "+(f.canRead()?" DA ":" NE "));

		//7. Moze li se upisivati u njega
		System.out.println(" Upisivanje : "+(f.canWrite()?" DA ":" NE "));
		
		//8. Velicina fajla
		System.out.println(" Velicina fajla: "+f.length());
		
		//9.Poslednja Modifikacija
		System.out.println(" Poslednja Modifikacija: "+f.lastModified());

	}

}
