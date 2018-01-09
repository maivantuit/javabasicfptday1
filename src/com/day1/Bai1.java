package com.day1;

import java.util.Scanner;

public class Bai1 {
		public void ChuongTrinhSao(int n){
			for (int i = 0; i < n; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		public void ChuongTrinhSaoGiam(int n){
			for (int i = n; i > 0; i--) {
				for (int j = 0; j <=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		public static void main(String[] args) {			
			Bai1 b1 = new Bai1();
			Scanner sc = new Scanner(System.in);
			System.out.println("Input n:");
			int n= sc.nextInt();
			b1.ChuongTrinhSao(n);
			System.out.println("---------------------------");
			b1.ChuongTrinhSaoGiam(n);
		}
}
