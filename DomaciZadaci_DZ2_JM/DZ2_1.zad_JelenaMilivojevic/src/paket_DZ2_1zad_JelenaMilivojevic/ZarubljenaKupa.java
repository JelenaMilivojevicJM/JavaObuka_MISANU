package paket_DZ2_1zad_JelenaMilivojevic;

public class ZarubljenaKupa {
	
private double r1;
private double r2;
private double h;
    
    public ZarubljenaKupa() {
        r1 = 2;
        r2 = 1;
        h = 1;
    }
    
    public ZarubljenaKupa(double r1, double r2, double h) {
        this.r1 = r1;
        this.r2 = r2;
        this.h = h;
    }
    
    public double getR1() {
        return r1;
    }
    
    public double getR2() {
        return r2;
    }
    
    public double getH() {
        return h;
    }
    
    public double getZapremina() {
        double zapremina = Math.PI * h * (r1 * r1 + r2 * r2 + r1 * r2) / 3;
        return zapremina;
    }
    
    public boolean manjaOd(ZarubljenaKupa kupa) {
        return this.getZapremina() < kupa.getZapremina();
    }
    
    public String toString() {
        return "K(" + r1 + ", " + r2 + ", " + h + ")";
    }
}
