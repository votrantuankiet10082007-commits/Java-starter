package OOP;

import java.util.Scanner;

public class bai1OOP1 {


	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập bán kính: ");
		int r = scanner.nextInt(); 
		
		double cv = 2 * r * Math.PI;
		double dt = r * r * Math.PI;
		
		System.out.println("Diện tích: " +dt);
		System.out.println("Chu vi: " +cv);
		
		scanner.close();
	}
}
