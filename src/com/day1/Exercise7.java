package com.day1;

public class Exercise7 {
	public static void main(String[] args) {
        int[] mangDem = new int[Character.MAX_VALUE];
        String str = "dont touch me";

        for(int i=0;i<str.length();i++){           
                // Ví dụ: kí tự sẽ tự động được ép về int có giá trị tương ứng
                // a = 65
                // A = 97
                mangDem[str.charAt(i)]++; // giá trị phần tử tại kí tự tương ứng sẽ được tăng lên 1.
                //System.out.println(mangDem[str.charAt(i)]);            
        }
        for(int i=0;i<mangDem.length;i++){
            // kiể tra giá trị tại kí tự đó có != 0
            if(mangDem[i]!=0){
                // In ra kí tự đó và số lần xuát hiện
                System.out.println((char)i + ":" + mangDem[i]);
            }
        }

    }

	
}
