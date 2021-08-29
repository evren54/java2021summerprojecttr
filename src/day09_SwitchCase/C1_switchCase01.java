package day09_SwitchCase;

import java.util.Scanner;

public class C1_switchCase01 {

	public static void main(String[] args) {
		
	        // Soru1 : Kullanicidan haftanin kacinci gunu oldugunu sorun
	        // ve gun ismini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("haftanin kacinci gunu oldugunu gýrýnýz");
		
		int gunNo=scan.nextInt();
		switch(gunNo) {
		case 1: 
			System.out.println("bugun pazartesi");
			break;
		case 2:
			System.out.println("bugun sali");
			break;
		case 3:
			System.out.println("bugun carsamba");
			break;
		case 4:
			System.out.println("bugun persembe");
			break;
		case 5:
			System.out.println("bugun cuma");
			break;
		case 6:
			System.out.println("bugun cumartesi");
			break;
		case 7:
			System.out.println("bugun pazar");
			break;
			default:
			System.out.println("lutfen gecerlý gun numarasý gýrýnýz");
		
		}
		
		
	}

}
