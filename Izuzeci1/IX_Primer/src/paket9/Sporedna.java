package paket9;

public class Sporedna {
	//Through an exception out of the method
		static void procA() {
			try {
				System.out.println("inside procA");
				throw new RuntimeException("demo");
				//Throw unutar metode - koristi se za bacanje izuzetaka u telu metode
			}finally{
				System.out.println("procA");
				//Finally blok se izvrsava bez ozbira da li je ili nije doslo do izuzetka
			}
		}
		
		static void procB() {
			try {
				System.out.println("procB");
				return;
			}finally{
				System.out.println("procB's finally");
			}
		}
		
		//Execute a try block normally
		static void procC() {
			try {
				System.out.println("inside procC");
			}finally{
				System.out.println("procC's finally");
			}
		}
		
}
