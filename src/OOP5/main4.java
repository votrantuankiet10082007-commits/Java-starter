package OOP5;

import java.util.Date;

public class main4 {
	public static void main(String[] args) {
		bai4OOP2[] ds = new bai4OOP2[5];
		ds[1] = new bai4OOP2 ("Nguyen Van A", new Date ("1/15/1990"), "GD", 3.5, 1800000);
		ds[2] = new bai4OOP2 ("Nguyen Van B", new Date ("5/20/1985"), "PGD", 3.0, 1800000);
		ds[3] = new bai4OOP2 ("Nguyen Van C", new Date ("10/10/1975"), "TP", 2.8, 1800000);
		ds[4] = new bai4OOP2 ("Nguyen Van D", new Date ("3/25/1990"), "PP", 2.5, 1800000);
		ds[5] = new bai4OOP2 ("Nguyen Van E", new Date ("08/12/1988"), "PP", 2.5, 1800000);
		
		System.out.println("Hien thi danh sach sinh vien");
		for(int i = 0; i < ds.length; i++) {
			ds[i].hienThiNhanVien();
		}
		
		double tong = 0;
		for(int i = 0; i < ds.length; i++) {
			tong = tong + ds[i].tinhLuong();
		}
	}
}
