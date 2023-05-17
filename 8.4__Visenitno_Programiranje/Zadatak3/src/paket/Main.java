package paket;

public class Main {
	public static void main(String[] args) {
		// inGeneral

		Thread t = Thread.currentThread();
		
		System.out.println("Trenutna nit: "+t.getName()+", "+t);
		System.out.println("Ime :"+t.getName());
		System.out.println("Klasa: "+t.getClass());
		
		//kreiranje novih niti
		
		//preko ruunable interface-a
		A a = new A();
		Thread t1 = new Thread(a,"Nit 1");
		t1.setPriority(6);
		Thread t2 = new Thread(a,"Nit 2");
		t2.setPriority(Thread.MAX_PRIORITY-2);
		
		t1.start();
		System.out.println();
		t2.start();
		
		//preko extenzije klase thread
		B b1 = new B("Nit 3");
		b1.start();
		b1.setPriority(Thread.MIN_PRIORITY+2);
		System.out.println();
		B b2 = new B("Nit 4");
		b2.start();
		b2.setPriority(3);
		
		
	}

}