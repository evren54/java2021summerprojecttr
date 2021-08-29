package day14_methodCreationForLoop;

import java.util.Scanner;

public class C03_MethodCreation03 {

	public static void main(String[] args) {
		 /*
        Soru 3) Email kontrolu yapan bir program yazin.Kullanicinin girdigi sifre  
           - @ isareti icermiyorsa gecersiz email yazdirin
           - @gmail.com icermiyorsa “lutfen gmail adresinizi girin” yazdirin
           - @gmail.com ile bitmiyorsa “Yazimda bir sorun var, maili kontrol ediniz”
           Bu sorunlardan hic biri yoksa "email adresiniz basariyla kaydedildi" yazdirin
        */
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen email adresinizi yaziniz....");
		
		String email=scan.next();//methoda ne yollayacagým--email--emöail stringdir
		emailKontrolEt(email);
        
        
        scan.close();
	}

	private static void emailKontrolEt(String email) {
		
		if (!email.contains("@"))  {
		} else if    (!email.contains("@gmail.com")){
			System.out.println("lutfen gmail adresinizi girin");
		} else if (!email.endsWith("@gmail.com")) {
		System.out.println("Yazimda bir sorun var, maili kontrol ediniz");
		}else { 
			System.out.println("mailiniz basariyla kaydeildi");
		}
		
		
	}

}
