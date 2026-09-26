package OOP4;

public class bai3OOP2 {
	private double a;
	private double b;
	private double c;

	bai3OOP2(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void giai() {
		if (a == 0) {
			if (b == 0) {
				if (c == 0) {
					System.out.println("Pt vo so nghiem");
				} else {
					System.out.println("Pt vo nghiem");
				}
			} else {
				double x = -c / b;
				System.out.println("Pt co nghiem x = " + x);
			}
		} else {
			double delta = b * b - 4 * a * c;
			if (delta < 0) {
				System.out.println("Phuong trinh vo nghiem");
			} else if (delta == 0) {
				double x = -b / (2 * a);
				System.out.println("Phuong trinh co nghiem kep: " + x);
			} else {
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b + Math.sqrt(delta)) / (2 * a);
				System.out.println("x1 =  " + x1);
				System.out.println("x2 = " + x2);
			}
		}
	}
}
