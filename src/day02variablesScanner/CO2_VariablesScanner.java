package day02variablesScanner;

import java.util.Scanner;

public class CO2_VariablesScanner {

	public static void main(String[] args) {

		// kullanicidan bir tamsayi al�p bu saitlar�n topla, fark ve carpimlarini yazdirin
		
		// kullanicidan deger alak icin 3 ad�m atmal�y�z
		// 1- scanner  objesi olustural�m
		       
		Scanner scan = new Scanner (System.in);
		//2- kullanicidan ne istedimizi yazidralim
		System.out.println("Lutfen iki tamsayi giriniz");
		
		
		// 3-next methodunu kullanarak girilen de�eleri al�p,olusturacag�m�z variablar� atayal�m
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		System.out.println("Girdiginiz Sayilarin toplami: " + (sayi1+sayi2));
		
		
		
		
	}

}
