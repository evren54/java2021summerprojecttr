package day41_exception01;

import java.util.Scanner;

public class Exception02 {

	public static void main(String[] args) {
		

		Scanner scanner= new Scanner(System.in);
		int count=1;
		while (count<=34) {
			System.out.println("bolunen sayýyý gýrýnýz");
			int sayi1=scanner.nextInt();
			
			System.out.println("bolen sayýyý gýrýnýz");
			int sayi2=scanner.nextInt();
			try {System.out.println("bolum : "+sayi1/sayi2);
			
			} catch (ArithmeticException e) {// try bodysýmde muhtemel hata arýthmathexceptýon olarak catch boy sart olarak yazýldý
				
				System.out.println("bolme iþlemlerýnde bolen 0 olmazzzzz");
System.out.println(e.getMessage());//by zero ---> handle edýlecek verýdýr
e.printStackTrace();//java arýthmatýcexveption / by zero
//bolunen sayýyý gýrýnýz= at day41_exception01.Exception02.main(Exception02.java:18)
//hatanýn handle edýlmesý ýcýn tum verýler yazýdýrldý 
			}
			count++;
System.out.println("dewamkee yazýsýný okuduysan kod bu satýra kadar sorunsuz run olmustur");
		}
	
	
}
}