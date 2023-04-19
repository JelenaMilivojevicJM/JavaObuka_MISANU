package paket2;

public class A extends Thread{
	
	A(String s){
		super(s);
	}
	
	public void run() {
		System.out.println("Hello");
	}

}
