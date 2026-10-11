package OOP;

import java.util.Scanner;

public class bai4OOP1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.print("Nhap so phan tu n: ");
        n = scanner.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap a[" + i + "]: ");
            a[i] = scanner.nextInt();
        }

        for(int i = 0; i < n; i++) {
        		for(int j = i+1; j < n; j++) {
        			if (a[i] > a[j]) {
        				int temp = a[i];
        				a[i] = a[j];
        				a[j] = temp;
        			}
        		}
        }
        System.out.println("Mang sau khi sap xep tang dan:"); 
        for (int i = 0; i < n; i++) { 
        		System.out.print(a[i] + " "); 
        	}
        scanner.close();
    }
}

