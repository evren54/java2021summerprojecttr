package day03_datacasting_increment;

import java.util.Scanner;

public class C1_Scanner01 {

	public static void main(String[] args) {
/*Soru 5) Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin
 Isminiz : Mehmet
 Soyisminiz : Bulut
 Kursumuza katiliminiz alinmistir,tesekkur ederiz */
		
Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen isminizi ve soyisminizi yaziniz, \nisminizi yazdiktan sonra Enter'a basýnýz");
		
		// syso içinde alt satýra geçmek istediðimizde \n yazarýz
		// \n den sonra bosluk býrakýrsak
		
		String name=scan.nextLine();
		String surname=scan.nextLine();
		
		
		// next() sadece ilk kelimeyi alýr, girilen kelime daha uzunsa girilen kelimeden sonrasý kalýr
		// nextLine () ise o satýrýn sonuna kadar girilen tum degerleri alýr
		
		System.out.println("Isminiz : " + name +"\nSoyisminiz :" + surname + "\nkursumuza katiliminiz alinmistir,tesekkurker");
		
		scan.close();
		
		
	}

}
