package OOP9;

public class QuanLyDanhSach {
	private SinhVien[] ds;
	private int soSV;

	public QuanLyDanhSach(int n) {
		ds = new SinhVien[n];
		this.soSV = 0;
	}

	public void themSV(SinhVien sv) {
		if (this.soSV < ds.length) {
			ds[this.soSV] = sv;
			this.soSV++;
		}
	}

	public void LietKe() {
		for (int i = 0; i < this.soSV; i++) {
			ds[i].HienThi();
		}
	}

	public void SapXepDS() {
		for (int i = 0; i < soSV - 1; i++) {
			for (int j = 1; j < soSV; j++) {
				if (ds[i].TachTen().compareTo(ds[i].TachTen()) > 0) {
					SinhVien temp = ds[i];
					ds[i] = ds[j];
					ds[j] = temp;
				}
			}
		}
	}

	public void LietKeGioi() {
		for(int i = 0; i < soSV; i++) {
			if(ds[i].getDTB() >= 8.0) {
				ds[i].HienThi();
			}
		}
	}
	public void TimSV(String a) {
		for(int i = 0; i < soSV; i++) {
			if(ds[i].TachTen().equals(a)) {
				ds[i].HienThi();
			}
		}
	}
		//Nguyen Van A
		//Nguyen Van B
		//Nguyen Van C
		//Nguyen Van D
		//Nguyen Van E
	public void XoaTenSV1(String b) {
		int i = 0;
		while (i < soSV) {
			if(ds[i].TachTen().equals(b)) {
				for(int j = i; j < i - 1; j++) {
					ds[j] = ds[j - 1];
				}
			}
		}
		soSV--;
	}
	
	public double TinhTuoiTB() {
		double tong = 0;
		for(int i = 0; i < soSV; i++) {
			tong += ds[i].TinhTuoi();
		}
		return tong/soSV;
	}
}

	
