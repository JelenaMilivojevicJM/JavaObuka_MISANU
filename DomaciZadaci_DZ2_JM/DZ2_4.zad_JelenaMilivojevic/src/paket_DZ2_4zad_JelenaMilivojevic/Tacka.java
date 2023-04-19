package paket_DZ2_4zad_JelenaMilivojevic;

public class Tacka {
	
	    private double masa;
	    private double x;
	    private double y;
	    private double z;
	    
	    public Tacka() {
	        this.masa = 1.0;
	        this.x = 0.0;
	        this.y = 0.0;
	        this.z = 0.0;
	    }
	    
	    public Tacka(double masa, double x, double y, double z) {
	        this.masa = masa;
	        this.x = x;
	        this.y = y;
	        this.z = z;
	    }
	    public double getMasa() {
	        return masa;
	    }

	    public double getX() {
	        return x;
	    }

	    public double getY() {
	        return y;
	    }

	    public double getZ() {
	        return z;
	    }   
	    public double rastojanje(Tacka t) {
	        double dx = this.x - t.getX();
	        double dy = this.y - t.getY();
	        double dz = this.z - t.getZ();
	        return Math.sqrt(dx*dx + dy*dy + dz*dz);
	    }
	    
	    public double privlacnaSil(Tacka t) {
	        double r = this.rastojanje(t);
	        double G = 6.67e-11;
	        return G * this.masa * t.getMasa() / (r*r);
	    }
	    
	    public void ispisi() {
	        System.out.printf("m=%.2f x=%.2f y=%.2f z=%.2f%n", masa, x, y, z);
	    }
	    
	}

