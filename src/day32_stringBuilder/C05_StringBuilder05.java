package day32_stringBuilder;

import java.util.Scanner;

public class C05_StringBuilder05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
        Bir c�mleyi parametre olarak kabul eden, StringBuilder kullanarak c�mleyi ters �eviren ve c�mlenin palindrom
            olup olmad���n� kontrol eden (b�y�k/k���k harf duyarl�l��� olmadan) bir Java program� yaz�n.
         (without case sensitivity)
         Eg : input : I love Java
         Output: "Reversed sentence : avaJ evol I 
            It is not a palindrome"
         */
    
     
        String str="tras neden sart";
        
        StringBuilder sB=new StringBuilder();
        sB.append(str);
        String terString=sB.reverse().toString();
                
                if (str.equalsIgnoreCase(terString)) {
                    System.out.println("girdiginiz ifade  polindrome dir "+terString);
            
        }else {
        	System.out.println("g�rd�g�n�z �fade pol�ndrome deg�ld�r"+terString);
        }
	}

}
