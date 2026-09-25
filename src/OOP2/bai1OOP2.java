package OOP2;

public class bai1OOP2 {
	
	private int tuSo;
	private int mauSo;
	
	public void tuSo(int t) {
		this.tuSo = t;
	}
	public int tuSo() {
		return tuSo;
	}
	public void mauSo(int m) {
		this.mauSo = m; 
	}
	public int mauSo() {
		return mauSo;
	}
	public void Hienthi() {
		System.out.println(tuSo + " / " + mauSo);
	}
	private int USCLN(int a, int b) {
		int temp = 0;
		while (a!=b) {
			temp = a%b;
			a = b;
			b = temp;
		}
		return a;
	}
	private void rutGon() {
		int a = this.tuSo;
		int b = this.mauSo;
		this.tuSo = this.tuSo/(USCLN(a,b));
		this.mauSo = this.mauSo/(USCLN(a,b));
	}
	
	public void Tang(int n) {
		if(n > 0) {
			this.tuSo = this.tuSo + n;
			this.mauSo = this.mauSo + n;
		}
	}
	
	public void Gap(int n) {
		if(n > 0) {
			this.tuSo = this.tuSo * n;
			this.mauSo = this.mauSo * n;
		}
    }
	
	public bai1OOP2 Cong(int n) {
		bai1OOP2 kq = new bai1OOP2();
		kq.tuSo = this.tuSo + n*this.mauSo;
		kq.mauSo = this.mauSo;
		kq.rutGon();
		return kq;
	}
	
	public bai1OOP2 Cong(bai1OOP2 p) {
		bai1OOP2 kq = new bai1OOP2();
		kq.tuSo = this.tuSo * p.mauSo + p.tuSo * this.mauSo;
		kq.mauSo = this.mauSo * p.mauSo;
		kq.rutGon();
		return kq;
	}
	
	public bai1OOP2 Tru(int n) {
		bai1OOP2 kq = new bai1OOP2();
		kq.tuSo = this.tuSo - n * this.mauSo;
		kq.mauSo = this.mauSo;
		kq.rutGon();
		return kq;
	}
	
	public bai1OOP2 Tru(bai1OOP2 p) {
		bai1OOP2 kq = new bai1OOP2();
		kq.tuSo = this.tuSo * p.mauSo - p.tuSo * this.mauSo;  
		kq.mauSo = this.mauSo * p.mauSo;
		kq.rutGon();
		return kq;
	}
	
	public bai1OOP2 Nhan(int n) {
		bai1OOP2 kq = new bai1OOP2();
		kq.tuSo = this.tuSo * n;
		kq.mauSo = this.mauSo;
		kq.rutGon();
		return kq;
	}
	
	public bai1OOP2 Nhan(bai1OOP2 p) {
		bai1OOP2 kq = new bai1OOP2();
		kq.tuSo = this.tuSo * p.tuSo;
		kq.mauSo = this.mauSo * p.mauSo;
		kq.rutGon();
		return kq;
	}
	
	public bai1OOP2 Chia(int n) {
		bai1OOP2 kq = new bai1OOP2();
		kq.tuSo = this.tuSo;
		kq.mauSo = this.mauSo * n;
		kq.rutGon();
		return kq;
	}
	
	public bai1OOP2 Chia(bai1OOP2 p) {
		bai1OOP2 kq = new bai1OOP2();
		kq.tuSo = this.tuSo * p.mauSo;
		kq.mauSo = this.mauSo * p.tuSo;
		kq.rutGon();
		return kq;
	}
	
	 public int soSanh(bai1OOP2 p) {

	    int a = this.tuSo * p.mauSo;
	    int b = p.tuSo * this.mauSo;

	    if (a > b) {
	       return 1;
	    }
	    else if (a < b) {
	       return -1;
	    }
	    else {
	       return 0;
	    }
	}
}
	
