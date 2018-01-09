package com.day1;

import java.util.Scanner;

public class Bai2 {
	public double totalExp(int n){
		double tong=0;
		for (int i = 1; i <= n; i++) {
			tong = tong + 1.0/i; // 1.0: to get after "," 
		}
		return tong;
	}
	public static void main(String[] args) {
		Bai2 b2 = new Bai2();
		Scanner sc = new Scanner(System.in);
		System.out.println("Input n:");
		int n = sc.nextInt();
		double result = b2.totalExp(n);
		System.out.println("Total Expression: "+result);
	}
}
