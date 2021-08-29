package day02variablesScanner;

import java.util.Scanner;

public class CO2_VariablesScanner {

	public static void main(String[] args) {

		// kullanicidan bir tamsayi alýp bu saitlarýn topla, fark ve carpimlarini yazdirin
		
		// kullanicidan deger alak icin 3 adým atmalýyýz
		// 1- scanner  objesi olusturalým
		       
		Scanner scan = new Scanner (System.in);
		//2- kullanicidan ne istedimizi yazidralim
		System.out.println("Lutfen iki tamsayi giriniz");
		
		
		// 3-next methodunu kullanarak girilen deðeleri alýp,olusturacagýmýz variablarý atayalým
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		System.out.println("Girdiginiz Sayilarin toplami: " + (sayi1+sayi2));
		
		
		
		
	}

}
