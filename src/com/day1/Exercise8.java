package com.day1;
import java.util.Scanner;

public class Exercise8 {
	Scanner sc = new Scanner(System.in);
	public void inputMatrix(int mt[][], int h, int c){
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print("Input element a["+i+"]["+j+"]: ");
				mt[i][j] = sc.nextInt();
			}
			System.out.println();
		}
	}
	public void outMatrix(int mt[][], int h, int c){
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(" "+mt[i][j]); 
			}
			System.out.println();
		}
	}
	public double outMatrixRow1(int mt[][], int h, int c){
		double tich =1;
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < c; j++) {
				//System.out.print(" "+mt[i][j]);
				if(mt[i][j]%3==0){
					tich = tich * mt[i][j];
				}
			}
			System.out.println();
		}
		if(tich ==1){
			tich =0;
		}
		return tich;
	}
	public double outMatrixRow2(int mt[][], int h, int c){
		double tich =1;
		for (int i = 1; i < 2; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(" "+mt[i][j]);
				if(mt[i][j]%3==0){
					tich = tich * mt[i][j];
				}
			}
			System.out.println();
		}
		if(tich ==1){
			tich =0;
		}
		return tich;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Exercise8 e8 = new Exercise8();				
		System.out.println("Input number row: ");
		int h = sc.nextInt();
		System.out.println("Input number column: ");
		int c = sc.nextInt();
		int mt[][] = new int[h][c];
		e8.inputMatrix(mt, h, c);
		System.out.println("Matrix after input: ");
		e8.outMatrix(mt, h, c);
		System.out.println("Row 1: ");
		double resulta= e8.outMatrixRow1(mt, h, c);
		System.out.println(resulta);
		
		System.out.println("Row 2: ");
		double resultb= e8.outMatrixRow2(mt, h, c);
		System.out.println(resultb);
		
		
	}
}
