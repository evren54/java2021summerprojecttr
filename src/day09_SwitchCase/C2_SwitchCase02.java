package day09_SwitchCase;

import java.util.Scanner;

public class C2_SwitchCase02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Soru3 : Kullanicidan bir sayi girmesini isteyin Girilen sayi 10 ise �Iki
		 * basamakli en kucuk sayi 100 ise �uc basamakli en kucuk sayi� 1000 ise �dort
		 * basamakli en kucuk sayi� diger durumlarda �Girdigin sayiyi degistir� yazdirin
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("bir tamsay� giriniz");

		int sayi = scan.nextInt();

		switch (sayi) {
		case 10:
			System.out.println("iki basamal� en kucuk say�");
			break;
		case 100:
			System.out.println("uc basamakl� en kucuk say�");
			break;
		case 1000:
			System.out.println("dortk basmaakl� en kucuk say�");
			break;
		default:
			System.out.println("girdigin say�y� deg�st�r");

		}

	}

}
