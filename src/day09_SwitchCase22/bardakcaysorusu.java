package day09_SwitchCase22;

import java.util.Scanner;

public class bardakcaysorusu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Kullanýcýya günde ne kadar çay içtiðini ve ne kadar þeker kullandýðýný sorun.
		 * Yýlda kaç kg þeker kullandýðýný hesaplayýn ve yazdýrýn.
		 * 1 þeker = 1.7 gr
		 * Örnek Çýktý:
		 * Yýlda 12.41 kg þeker kullanýyor.
		 */
      Scanner scan=new Scanner(System.in);
   System.out.println("Gunder kaç bardak çay içersiniz");
   int gunlukBardak=scan.nextInt();
   System.out.println("Býr bardakta ne kadar seker kullanýrsýnýz");
   int sekeradet=scan.nextInt();
   double birseker=1.7;
   
   
   System.out.println("Yilda"+(gunlukBardak*sekeradet*birseker*365)/1000+" kg þeker kullanýyor");

		
		
		
		
		
		
		
	}

}
