package OOP6;

public class main6 {

    public static void main(String[] args) {

        SinhVien[] sv = new SinhVien[1];

        Diem dm1 = new Diem("Lập trình cơ bản", 3, 5.0f, 5.0f, 5.0f);

        Diem dm2 = new Diem("Cơ sở dữ liệu", 3, 5.0f, 5.0f, 5.0f);

        sv[0] = new SinhVien("Võ Trần Tuấn Kiệt", dm1, dm2);

        System.out.println("Điểm trung bình: " + sv[0].tinhDTB());
    }
}