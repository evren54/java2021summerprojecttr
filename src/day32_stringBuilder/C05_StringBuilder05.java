package day32_stringBuilder;

import java.util.Scanner;

public class C05_StringBuilder05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
        Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
            olup olmadýðýný kontrol eden (büyük/küçük harf duyarlýlýðý olmadan) bir Java programý yazýn.
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
        	System.out.println("gýrdýgýnýz ýfade polýndrome degýldýr"+terString);
        }
	}

}
