package OOP5;

import java.util.Date;

public class bai4OOP2 {
	private String hoTen;
	private Date ngaySinh;
	private String chucVu;
	private double heSoLuong;
	private double luongCB;
	
	public bai4OOP2 (String hoTen, Date ngaySinh, String chucVu, double heSoLuong, double luongCB) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.chucVu = chucVu;
		this.heSoLuong = heSoLuong;
		this.luongCB = luongCB;
	}
	
	public double heSoPhuCap() {
		if (chucVu.equals("GD")) {
			return 1.0;
		}
		if (chucVu.equals("PGD")) {
			return 0.8;
		}
		if (chucVu.equals("TP")) {
			return 0.5;
		}
		if (chucVu.equals("PP")) {
			return 0.4;
		}
		
		return 0;
	}
	
	public double tinhLuong() {
		return ((heSoLuong + heSoPhuCap()) * luongCB);
	}
	
	public double baoHiemXaHoi() {
		return (luongCB * (6.0 / 100));
	}
	
	public double tienBaoHiemThatNghiep() {
		return (luongCB * (1.0 / 100));
	}
	
	public double soTienNhan() {
		return (luongCB - (baoHiemXaHoi() + tienBaoHiemThatNghiep()));
	}
	
	public void hienThiNhanVien() {
		System.out.println("Họ và tên: " + hoTen);
        System.out.println("Lương: " + tinhLuong());
        System.out.println("BHXH: " + baoHiemXaHoi());
        System.out.println("BHTN: " + tienBaoHiemThatNghiep());
        System.out.println("Số tiền còn nhận:: " + soTienNhan());
	}
}
