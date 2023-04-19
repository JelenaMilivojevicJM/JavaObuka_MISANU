package paket_output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class OutputVezba {

	public static void main(String[] args) throws IOException {
		// 1:
		
		FileInputStream fis = new FileInputStream("FilezaOutput.txt");
		
		//2:
		System.out.println("Sadrzaj Fajla: " + fis);
		
		int vrednost;
		
		while((vrednost=fis.read())!=-1) {
			System.out.println((char)vrednost);
		}
		fis.close();
 
	}

}
