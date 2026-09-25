package OOP2;

public class main1OOP2 {
	public static void main(String[] args) {
		
		bai1OOP2 ps1 = new bai1OOP2();
		ps1.tuSo(1);
		ps1.mauSo(2);
		
		bai1OOP2 ps2 = new bai1OOP2();
        ps2.tuSo(5);
        ps2.mauSo(7);
        
        ps1.Hienthi();
        ps2.Hienthi();
        
        bai1OOP2 r = ps1.Cong(ps2);
        System.out.println("r = ps1 + ps2 " );
        r.Hienthi();
        
        bai1OOP2 t = ps1.Nhan(2).Tru(ps2);
        System.out.println("t = 2*ps1 - ps2 = " );
        t.Hienthi();
        
        int kq = ps1.soSanh(ps2);
        if(kq > 0) {
        		System.out.println("ps1 > ps2");
        }else if (kq < 0) {
        		System.out.println("ps1 < ps2");
        }else {
        		System.out.println("ps1 = ps2 ");
        }
        
        
	}
}
