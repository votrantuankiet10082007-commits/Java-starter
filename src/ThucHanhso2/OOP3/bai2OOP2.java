package OOP3;

public class bai2OOP2 {
	private String soTK;
	private double soDu;
	
	public void soTK(String s) {
		this.soTK = s;
	}
	public String soTK() {
		return soTK;
	}
	
	public void soDu(double t) {
		this.soDu = t;
	}
	
	public double soDu() {
		return soDu;
	}
	
	public bai2OOP2(String stk, double sd) {
		this.soTK = stk;
		this.soDu = sd;
	}
	
	public String laySTK() {
		return this.soTK;
	}
	public double laySD() {
		return this.soDu;
	}
	
	public String toString() {
		return "So tk: " + this.soTK + ", So du: " + this.soDu;
	}
	
	public void napTien(double st) {
		if(st > 0) {
			this.soDu = this.soDu + st;
		}
	}
	
	public boolean rutTien(double st) {
		if(st > 0 && soDu - st >= 100) {
			soDu = this.soDu - st;
			return true;
		}
		return false;
	}
	
	public boolean chuyenTien(bai2OOP2 tk, double st) {
		if(st > 0 && soDu - st >= 100) {
			soDu = this.soDu - st;
			tk.soDu = tk.soDu + st;
			return true;
		}
		return false;
	}
}
