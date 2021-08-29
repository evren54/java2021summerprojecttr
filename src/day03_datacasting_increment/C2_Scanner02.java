package day03_datacasting_increment;

import java.util.Scanner;

public class C2_Scanner02 {

	public static void main(String[] args) {
		
		
		// 7Kullanýdan ismini alýp isminin bas harfini isteyim
		
		Scanner scan=new Scanner (System.in);
		System.out.println("lutfen isminizi giriniz");
		
		char ilkHarf=scan.next().charAt(0);
		
		System.out.println("girdiginiz kelimenin ilk harfi :" + ilkHarf);
	}

}
