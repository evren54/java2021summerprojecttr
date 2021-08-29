package day12_stringManipulations;

import java.util.Scanner;

public class c03_StringManipulation03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Soru 6) Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari
		 * sagliyorsa “Sifre basari ile tanimlandi”, sartlari saglamazsa “Islem
		 * basarisiz,Lutfen yeni bir sifre girin” yazdirin - Ilk harf buyuk harf olmali
		 * - Son harf kucuk harf olmali - Sifre bosluk icermemeli - Sifre uzunlugu en az
		 * 8 karakter olmali
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen sýfrenýzý gýrýnýz");
		String sifre = scan.nextLine();
		boolean ilkHarfkont = sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z';
		boolean sonHarfKontrol = sifre.charAt(sifre.length() - 1) >= 'a' && sifre.charAt(sifre.length() - 1) <= 'z';

		boolean spaceKontrol = !sifre.contains(" ");
		//bsa unlem kosmazsam space" " varsa true space" "  yoksa false olur 
		//basa unlem koyuyorum ký space onlmadýgýnda true donsun 
		boolean uzunlukKontrol = sifre.length() >= 8;
      if(ilkHarfkont && sonHarfKontrol && spaceKontrol && uzunlukKontrol)  {
      System.out.println("sifre basari ile tanimlandi");
      }else { 
    	  System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin");
      }
	}

}
