package day03_datacasting_increment;

import java.util.Scanner;

public class C1_Scanner01 {

	public static void main(String[] args) {
/*Soru 5) Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin
 Isminiz : Mehmet
 Soyisminiz : Bulut
 Kursumuza katiliminiz alinmistir,tesekkur ederiz */
		
Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen isminizi ve soyisminizi yaziniz, \nisminizi yazdiktan sonra Enter'a bas�n�z");
		
		// syso i�inde alt sat�ra ge�mek istedi�imizde \n yazar�z
		// \n den sonra bosluk b�rak�rsak
		
		String name=scan.nextLine();
		String surname=scan.nextLine();
		
		
		// next() sadece ilk kelimeyi al�r, girilen kelime daha uzunsa girilen kelimeden sonras� kal�r
		// nextLine () ise o sat�r�n sonuna kadar girilen tum degerleri al�r
		
		System.out.println("Isminiz : " + name +"\nSoyisminiz :" + surname + "\nkursumuza katiliminiz alinmistir,tesekkurker");
		
		scan.close();
		
		
	}

}
