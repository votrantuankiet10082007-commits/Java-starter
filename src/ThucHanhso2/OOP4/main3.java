package OOP4;

import java.util.Scanner;

public class main3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Nhap a: ");
		int a = scanner.nextInt();
		
		System.out.println("Nhap b: ");
		int b = scanner.nextInt();
		
		System.out.println("Nhap c: ");
		int c = scanner.nextInt();
		
		bai3OOP2 pt = new bai3OOP2(a , b, c);
		pt.giai();
	}
}
