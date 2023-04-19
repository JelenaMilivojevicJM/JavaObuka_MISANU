package paket;

import java.io.File;

public class Fajl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* */
		
		
		/* */
		
		//Napraviti fajl i ispitati svojstva
		File f = new File("C:\\Users\\jelen\\OneDrive\\Desktop\\Dokument1.java");
		
				//"C:\\Users\\jelen\\OneDrive\\Desktop\\MISANU\\Gradivo_V Test\\Predavanje 32_Januar24_Utorak");
	
		//C:\Users\jelen\OneDrive\Desktop
		
		System.out.println("Fajl: "+f.getName()+(f.isFile()? " Je fajl!" : " Nije fajl!"));
		
		System.out.println("Apsolutna Putanja: "+f.getAbsolutePath());
		System.out.println(f.exists()? " Fajl postoji" : "Fajl ne postoji");
		System.out.println(f.isDirectory() ? " Direktorijum ": "Fajl");
		System.out.println(f.canRead()?" Moze biti procitan! ":" Ne moze biti procitan!");
		System.out.println(f.canWrite()?" Omoguceno je upisivanje! ":" Nije omoguceno je upisivanje!!");
		System.out.println("Velicina: "+f.length());//Ovo je velicina kada ima texta
		System.out.println("Poslednja promena: "+f.lastModified());
	
	
	}

}
