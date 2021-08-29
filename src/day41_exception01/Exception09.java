package day41_exception01;

import java.util.Scanner;

public class Exception09 {

	public static void main(String[] args) {
		/*
         * Kullanicidan carpma yapmak icin bir String isteyin. Kullanicinin girdigi
         * String sadece sayilardan olusuyorsa sayiyi 2 ile carpip sonucu yazdirin.
         * Kullanici sayilardan olusmayan bir String girerse
         * "Girdiginiz String sayiya cevrilemez" yazdirin.--> hata firlatin...
         */
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("sayi giriniz");
		String str=scanner.nextLine();
		
		try {
			//NumberFormatException
			System.out.println(2*Integer.parseInt(str));
		
		} catch (Exception e) {
			System.out.println("Girdiginiz sayi String e cevrýlemez");
		}
		scanner.close();
		
		
}
}