package OOP9;

import java.util.Date;

public class SinhVien {
	private String HoTen;
	private Date NgaySinh;
	private double DTB;
	
	public SinhVien(String HoTen, Date NgaySinh, double DTB) {
		this.HoTen = HoTen;
		this.NgaySinh = NgaySinh;
		this.DTB = DTB;
	}
	public String getHoTen() {
		return this.HoTen;
	}
	public Date getNgaySinh() {
		return this.NgaySinh;
	}
	public double getDTB() {
		return this.DTB;
	}
	
	public String TachHo() {
		int vt = this.HoTen.indexOf(" ");
		return this.HoTen.substring(0,vt);
	}
	public String TachDem() {
		int vt1 = this.HoTen.indexOf(" ");
		int vt2 = this.HoTen.lastIndexOf(" ");
		return this.HoTen.substring(vt1, vt2);
	}
	public String TachTen() {
		int vt = this.HoTen.lastIndexOf(" ");
		return this.HoTen.substring(vt + 1);
	}
	
	public int TinhTuoi() {
		 Date hienTai = new Date();

		 int namHienTai = hienTai.getYear() + 1900;
		 int namSinh = this.NgaySinh.getYear() + 1900;

		 return namHienTai - namSinh;
	}
	
	public String XepLoai() {
		String xl = "";
		if(DTB >= 8.0) {
			xl = "Gioi";
		}else 
			if(DTB >= 7.0) {
				xl = "Kha";
			}else 
				if(DTB >= 5.0) {
					xl = "tb";
				}else {
					xl = "Yeu";
				}
		return xl;
	 }
	
	public void HienThi() {
	    System.out.println("Ho ten: " + this.HoTen);
	    System.out.println("Ngay sinh: " + this.NgaySinh);
	    System.out.println("Diem trung binh: " + this.DTB);
	    System.out.println("Ho: " + this.TachHo());
	    System.out.println("Dem: " + this.TachDem());
	    System.out.println("Ten: " + this.TachTen());
	    System.out.println("Tuoi: " + this.TinhTuoi());
	}
}
