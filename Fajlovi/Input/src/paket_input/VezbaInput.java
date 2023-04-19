package paket_input;
import java.io.DataInputStream;
import java.io.FileOutputStream;
public class VezbaInput {

	public static void main(String[] args) throws Throwable {
		//1:
		DataInputStream dis = new DataInputStream(System.in);

		//2:
		FileOutputStream fos = new FileOutputStream("NoviFajl2.txt");
		
		//3:
		System.out.println("Unos: -Za prekid unesite $");
		char karakter;
		while((karakter=(char)dis.read())!='$') {
			fos.write(karakter);
		}
		fos.close();
	}

}
