package day11_stringManipulations;

import java.util.Scanner;

public class C02_StringManupulations02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  /*
        Soru 1) Kullanicidan email adresini girmesini isteyin, 
        mail @gmail.com iceriyorsa �Email adresiniz kaydedildi�, 
        icermiyorsa �Lutfen gmail mail adresinizi giriniz.. � yazdirin 
     */
		
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Lutfen gma�l giriniz");
        String mail=scan.nextLine();
        
		if(mail.contains("@gmail.com")) {
			System.out.println("ema�l adres�n�z kaydedildi");
		}else { System.out.println("lutfen gma�l ma�l adres�n�z� g�r�n�z...");
		}

		
		
		
		
	}

}
