package OOP9;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class main9 {
	public static void main (String[] args) throws ParseException {
		SinhVien[] sv = new SinhVien[3];
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date ns0 = sdf.parse("15/10/2000");
		Date ns1 = sdf.parse("20/03/2001");
		Date ns2 = sdf.parse("22/05/2005");
		
		
		sv[0] = new SinhVien("Nguyen Van A", ns0, 8.0 );
		sv[1] = new SinhVien("Nguyen Van B", ns1, 7.9);
		sv[2] = new SinhVien("Nguyen Van C", ns2, 9.0);
		
		QuanLyDanhSach list = new QuanLyDanhSach(5);
		list.themSV(sv[0]);
		list.themSV(sv[1]);
		list.themSV(sv[2]);
		list.LietKe();
		
		System.out.println("Tim sinh vien Nam trong danh sach: " );
		list.TimSV("Nam");
		
		System.out.println("Danh sach sinh vien xoa ten Hoa: ");
		list.XoaTenSV1("Hoa");
		list.LietKe();
		
		System.out.println("Tuoi trung binh " + list.TinhTuoiTB());
		
		System.out.println("Danh sach sau khi sap xep ");
		list.SapXepDS();
		list.LietKe();
		
	}
}
