package vezbanje;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\jelen\\OneDrive\\Desktop\\Dokument.java");
		
		if(f.exists()) {
			System.out.println("Postoji");
		}else {
			System.out.println("NE Postoji");
		}
		
		System.out.println((f.isFile()?" JESTE fajl":" NIJE fajl"));
		
	}

}
