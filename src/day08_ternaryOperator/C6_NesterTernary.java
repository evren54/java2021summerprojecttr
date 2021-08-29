package day08_ternaryOperator;

import java.util.Scanner;

public class C6_NesterTernary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Kullanicidan bir tamsayi alin ve sayi 10’dan kucukse “Rakam veya negatif
		// sayi” ,
		// 100’den kucukse “iki basamakli sayi”
		// degilse “uc basamakli veya daha buyuk sayi” yazdirin

		Scanner scan=new Scanner (System.in);
		System.out.println("Lutfen bir tam sayi giriniz");
		int sayi=scan.nextInt();
		 System.out.println(sayi<10 ? "Rakam veya negatif" : (sayi<100 ? "iki basamakli sayi" :"uc basamakli yada daha buyuk")   );

		
	}

}
