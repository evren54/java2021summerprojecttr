package day09_SwitchCase22;

import java.util.Scanner;

public class dikdörtgeningalaný {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Kullanýcýdan dikdörtgenin kenar uzunluklarýný alýn ve dikdörtgenin alanýný ve çevresini konsola yazdýran bir program yazýn.

Örnek Çýktý:

Alan: 32

Çevre: 24
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println(" Lutfen dikdortgenýn kýsa kenarýný uzunlugunu gýrýnýz");
		int kk=scan.nextInt();
		System.out.println("lutfen dikdortgenýn uzun kenarýný gýrýnýz");
		int uk=scan.nextInt();
		
		int alan=kk*uk;
		int cevre=2*(kk+uk);
		
		System.out.println("Dikdörtgenin alani : " +alan);
		System.out.println("Dikdörtgenin cevresi : " +cevre);
	}

}
