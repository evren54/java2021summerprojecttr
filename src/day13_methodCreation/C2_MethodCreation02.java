package day13_methodCreation;

import java.util.Scanner;

public class C2_MethodCreation02 {

	public static void main(String[] args) {
		 // Kullanicidan 2 tamsayi isteyin
        // bu sayilarin toplamlarini ve carpimlarini 
        // iki ayri method'da hesaplayip yazdirin
        
       
        
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen ýký tamsayý gýrýnýz");
        
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        
        // method olusturmanin kolay yolu
        // method ismini ve parametreleri yazin (method call)
        toplama(sayi1,sayi2);
        
        carpma (sayi1,sayi2);
        carpma (sayi1+2,sayi2*2);//8*12=96
        
        
        toplama(sayi1+3,sayi2+1); // 8+7 =15
        
        
        
        sayi1=20;
        sayi2=15;
        toplama (sayi1,sayi2);//35
        carpma (sayi1,sayi2);//300
     // Sonuc olarak uygulamanizda tekrar tekrar kullanmaniz gereken kod bloklari icin
        // her seferinde yeniden yazmak yerine , bu blogu bir method'da yazip
        // ihtiyacimiz oldugu her seferde cagirmak daha mantiklidi
	}
	

    // Bir method sadece konsolda birseyler yazdiracaksa return type olarak void yazilir
    // bu durumda return keyword'une ihtiyac olmaz
    // ve METHOD BIZE BIR SONUC DONDURMEZ

			

	

	private static void carpma(int sayi1, int sayi2) {
		System.out.println("girlen sayilarim carpimi:" + sayi1*sayi2);
		
	}







	private static void toplama(int sayi1, int sayi2) {
		System.out.println("girilen sayilarin toplami :" + (sayi1+sayi2));
		
	}

}
