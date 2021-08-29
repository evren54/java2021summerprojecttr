package ETUTLER;

import java.util.Scanner;

public class forWhile9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Kullanýcýnýn girdiði sayýyý tersine çeviren bir java programý yazýnýz. (Mulakat Sorusu)

		Input :1238

		Output :Girilen Numananin Tersi: 8321
	}
		 * 
		 */
Scanner scan=new Scanner(System.in);
String sayi=scan.next();
String yeniSayi="";

for (int i=0; i<sayi.length();i++) {
	yeniSayi+=sayi.substring(sayi.length()-1-i,sayi.length()-i);
}
System.out.println(" Girilen sayinin tersi :"+yeniSayi);

}
}
