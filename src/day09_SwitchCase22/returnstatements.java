package day09_SwitchCase22;

import java.util.Scanner;

public class returnstatements {

	public static void main(String[] args) {

	Scanner scan=new Scanner(System.in); 	
	System.out.println("Lutfen bir ayi giriniz ");
	String sayi=scan.nextLine();
	String ters="";
		
	for (int i = sayi.length()-1; i>=0; i--) {
		ters=ters+sayi.charAt(i);
	}	
		
		System.out.println("Girdiginiz sayinin tersi :\n"+ters);
		
		
		
		
		
		
		
		
		
	}

}
