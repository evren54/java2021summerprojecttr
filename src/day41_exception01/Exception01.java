package day41_exception01;

import java.util.Scanner;

public class Exception01 {
public static void main(String[] args) {
	

	Scanner scanner= new Scanner(System.in);
	System.out.println("bolunen sayiyi giriniz");
	int sayi1=scanner.nextInt();
	
	System.out.println("bolen say�y� g�r�n�z");
	int sayi2=scanner.nextInt();
	try {System.out.println("bolum : "+sayi1/sayi2);
		
	} catch (ArithmeticException e) {// try bodys�mde muhtemel hata ar�thmathexcept�on olarak catch boy sart olarak yaz�ld�
		
		System.out.println("bolme i�lemler�nde bolen 0 olmazzzzz");
	}
	//e ; ar�thmat�c exveption class�ndak� daya typed�r
	// 

}
}

