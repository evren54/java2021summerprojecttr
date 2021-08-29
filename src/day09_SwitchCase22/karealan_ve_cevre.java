package day09_SwitchCase22;

import java.util.Scanner;

public class karealan_ve_cevre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Kullanýcýdan karenin kenar uzunluðunu alýn ve karenin alanýný ve çevresini konsola yazdýran bir program yazýn.

Ornek Cikti :

Alan: 9

Cevre: 12
 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" lutfen karenýn bir kenarýný  gýrýnýz");
		int kenar1=scan.nextInt();
		
		int alan=kenar1*kenar1;
		int cevre=kenar1*4;
				
		System.out.println("Alan : " + alan);
		System.out.println("Cevre :" + cevre);
	}

}
