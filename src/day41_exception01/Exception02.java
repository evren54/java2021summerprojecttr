package day41_exception01;

import java.util.Scanner;

public class Exception02 {

	public static void main(String[] args) {
		

		Scanner scanner= new Scanner(System.in);
		int count=1;
		while (count<=34) {
			System.out.println("bolunen say�y� g�r�n�z");
			int sayi1=scanner.nextInt();
			
			System.out.println("bolen say�y� g�r�n�z");
			int sayi2=scanner.nextInt();
			try {System.out.println("bolum : "+sayi1/sayi2);
			
			} catch (ArithmeticException e) {// try bodys�mde muhtemel hata ar�thmathexcept�on olarak catch boy sart olarak yaz�ld�
				
				System.out.println("bolme i�lemler�nde bolen 0 olmazzzzz");
System.out.println(e.getMessage());//by zero ---> handle ed�lecek ver�d�r
e.printStackTrace();//java ar�thmat�cexveption / by zero
//bolunen say�y� g�r�n�z= at day41_exception01.Exception02.main(Exception02.java:18)
//hatan�n handle ed�lmes� �c�n tum ver�ler yaz�d�rld� 
			}
			count++;
System.out.println("dewamkee yaz�s�n� okuduysan kod bu sat�ra kadar sorunsuz run olmustur");
		}
	
	
}
}