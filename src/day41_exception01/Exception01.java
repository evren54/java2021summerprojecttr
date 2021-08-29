package day41_exception01;

import java.util.Scanner;

public class Exception01 {
public static void main(String[] args) {
	

	Scanner scanner= new Scanner(System.in);
	System.out.println("bolunen sayiyi giriniz");
	int sayi1=scanner.nextInt();
	
	System.out.println("bolen sayýyý gýrýnýz");
	int sayi2=scanner.nextInt();
	try {System.out.println("bolum : "+sayi1/sayi2);
		
	} catch (ArithmeticException e) {// try bodysýmde muhtemel hata arýthmathexceptýon olarak catch boy sart olarak yazýldý
		
		System.out.println("bolme iþlemlerýnde bolen 0 olmazzzzz");
	}
	//e ; arýthmatýc exveption classýndaký daya typedýr
	// 

}
}

