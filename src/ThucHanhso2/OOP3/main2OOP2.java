package OOP3;

public class main2OOP2 {
	public static void main(String[] args) {
		bai2OOP2[] ds = new bai2OOP2 [5];
		ds[1] = new bai2OOP2 ("1111111", 100);
		ds[2] = new bai2OOP2 ("2222222", 100);
		ds[3] = new bai2OOP2 ("3333333", 100);
		ds[4] = new bai2OOP2 ("4444444", 100);
		ds[5] = new bai2OOP2 ("5555555", 100);
		
		ds[0].napTien(1000);
		ds[1].chuyenTien(ds[2], 500);
		ds[2].rutTien(200);
		
		for(int i = 0; i < ds.length; i++) {
			System.out.println(ds[i]);
		}
		
		double tongTien = 0;
		for(int i = 0; i < ds.length; i++) {
			tongTien = tongTien + ds[i].laySD();
		}
	}
}
