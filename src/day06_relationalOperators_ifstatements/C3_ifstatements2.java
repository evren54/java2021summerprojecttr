package day06_relationalOperators_ifstatements;

import java.util.Scanner;

public class C3_ifstatements2 {

	public static void main(String[] args) {
//Kullanýcýdan bir tam sayý isteyin ve sayinin tek veya çift oldugunu yazdirin
		
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Lutfen bire sayi giriniz");
		 int girilenSayi=scan.nextInt();
		 
		 if (girilenSayi%2==0)  {
			 
			 System.out.println("Girdiginiz sayi cift sayi");
			 
			 
		 }
		 
           if (girilenSayi%2==1)  {
			 
			 System.out.println("Girdiginiz sayi tek sayi");
			 
			 
		 }
		 
		if (girilenSayi<0) {
			System.out.println("Lutfen pozitif bir tamsayi giriniz");
		}
			
	}

}
