package OOP;

import java.util.Scanner;

public class bai5OOP1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int n;
		
		System.out.println("Nhap so phan tu trong mang: ");
		n = scanner.nextInt();
		
		int[] a = new int [n];
		
		for (int i = 0; i < n; i++) {
            System.out.print("Nhap a[" + i + "]: ");
            a[i] = scanner.nextInt();
        }
		
		int max = a[0];
		int vtmax = 0;
		
		for (int i = 0; i < n; i++) {
			if(a[i] > max) {
				max = a[i];
				vtmax = i;
				System.out.println("So lon nhat la: "+ a[i]);
				System.out.println("Tai vi tri: "+i);
			}
		}
		scanner.close();
	}
}
