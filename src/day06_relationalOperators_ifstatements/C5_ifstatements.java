package day06_relationalOperators_ifstatements;

import java.util.Scanner;

public class C5_ifstatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Soru 4) Kullanicidan dikdortgenin kenar uzunluklarini isteyin 
        // ve dikdortgenin kare olup olmadigini yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lUTFEN KENAR UZUNLUKLARINDAN VIRINI TAMSAI OLARAK GIRINIZ");
		int kenar1=scan.nextInt();
		System.out.println("Lutfen diger kenar uzunlugunu tamsayý olarak giriniz");
		int kenar2=scan.nextInt();
		
		if (kenar1==kenar2) {
			
			
			System.out.println("girdiginiz dikdirtgen bir kare");
			
			if (kenar1!=kenar2) {System.out.println("girdiginiz dikdörtgen bir kare degil");
			
			
			}
			
		}
	}

}
