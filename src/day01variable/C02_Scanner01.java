package day01variable;

import java.util.Scanner;

public class C02_Scanner01 {

	public static void main(String[] args) {

		
		// kullanicidan bilgi almak icin uc adima ihyiyacimiz var 
		//1-  Sacnner class'indan bir object olusturuyoruz.
		Scanner scan=new Scanner(System.in);
		
		// 2.Kullaniciya ne itediginiz bildiren bir mesaj yazin
		System.out.println("lutfen isminizi giriniz");
		
		//kullanicidan istedigimiz bilginin data turune gore 
		// bir variable olusturun
		//konsolda yazilan bilgiyi kodlarimizin icine aliyoruz
		
		
		String kullanicininIsmi = scan.nextLine();
		
		System.out.println("Girdiginiz isim : " + kullanicininIsmi);
	}

}
