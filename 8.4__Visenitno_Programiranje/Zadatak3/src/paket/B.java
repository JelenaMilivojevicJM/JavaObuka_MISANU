package paket;
public class B extends Thread{

	B(String s){
		super(s);
	}
	
	public void run() {
		try{
			Thread.sleep(800);
		System.out.print("NIT: ");
		int i = 0;
		do{
			System.out.print("B");
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