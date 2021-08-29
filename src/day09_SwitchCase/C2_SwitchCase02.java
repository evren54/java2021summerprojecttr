package day09_SwitchCase;

import java.util.Scanner;

public class C2_SwitchCase02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Soru3 : Kullanicidan bir sayi girmesini isteyin Girilen sayi 10 ise “Iki
		 * basamakli en kucuk sayi 100 ise “uc basamakli en kucuk sayi” 1000 ise “dort
		 * basamakli en kucuk sayi” diger durumlarda “Girdigin sayiyi degistir” yazdirin
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("bir tamsayý giriniz");

		int sayi = scan.nextInt();

		switch (sayi) {
		case 10:
			System.out.println("iki basamalý en kucuk sayý");
			break;
		case 100:
			System.out.println("uc basamaklý en kucuk sayý");
			break;
		case 1000:
			System.out.println("dortk basmaaklý en kucuk sayý");
			break;
		default:
			System.out.println("girdigin sayýyý degýstýr");

		}

	}

}
