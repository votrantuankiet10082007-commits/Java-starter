package OOP;

import java.util.Scanner;

public class bai3OOP1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        int demChan = 0;
        int demLe = 0;


        System.out.print("Nhap so phan tu n: ");
        n = scanner.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap a[" + i + "]: ");
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                demChan++;
            } else {
                demLe++;
            }
        }

        System.out.println("So luong so chan: " + demChan);
        System.out.println("So luong so le: " + demLe);

        scanner.close();
    }
}

