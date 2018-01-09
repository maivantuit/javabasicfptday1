package com.day1;

import java.util.Scanner;

public class Bai3 {
	public double calcuFactorial(int m){
		double gt =0;
		if(m==0 || m==1){
			return 1;
		}else{
			gt =1;
			for (int i = 2; i <= m; i++) {
				gt = gt * i;
			}
		}
		return gt;
	}
	public double totalExpres2(int n){
		double tong =0;
		for (int i = 1; i <= n; i++) {
			int m = 2*i-1;
			double result =calcuFactorial(m);
			tong = tong + 1.0/(result); // it with a qui luat.
		}
		return tong;
	}
	public static void main(String[] args) {		
		Bai3 b3 = new Bai3();		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input n:");
		int n = sc.nextInt();
		double result =b3.totalExpres2(n);
		System.out.println(result);
		
	}
}
