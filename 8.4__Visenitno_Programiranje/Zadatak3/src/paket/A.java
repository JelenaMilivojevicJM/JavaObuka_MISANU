package paket;

public class A implements Runnable{

	public void run() {
		try {
			Thread.sleep(3800);
		System.out.print("NIT: ");
		int i = 0;
		do{
			System.out.print("A");
			i++;
		}while(i<5);
		System.out.println();
		}catch(Exception e) {
			System.out.println("Nit A je prekinuta");
		}finally {
			System.out.println("Kraj");
		}
		
	}
}
