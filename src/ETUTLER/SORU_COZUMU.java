package ETUTLER;

import java.util.Scanner;

public class SORU_COZUMU {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		/*
		 * Sayinin Mükemmel sayý olup olmadýðýný kontrol eden Java kodunu yazýn.

Sayýnýn kendisi hariç pozitif bölenlerinin toplamý o sayýya eþitse, herhangi bir sayý Mükemmel Sayý olarak bilinir.
Input :

6

Output:

6 Mukemmel Sayidir.

======================

Input

7

Output:

7 Mukemmel Sayidir degildir.
		 */
		Scanner scan=new Scanner(System.in);
		int sayi=scan.nextInt();
		
		System.out.println("Lutfen bir sayi giriniz");
		
		int bolenToplam=0;
		//bolený ý olarak ttanýmladik
		for (int i=sayi-1; i>0;i--) {
			if (sayi%i==0) {
			
			}
			
			if(sayi==bolenToplam) {
				System.out.println(sayi+"mukemmel sayidir");}
				else {
					System.out.println(sayi+"Mukemmel sayi degildir");
			}
		
		
		}}
		
	}
		

