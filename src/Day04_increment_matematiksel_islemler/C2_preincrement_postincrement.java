package Day04_increment_matematiksel_islemler;

public class C2_preincrement_postincrement {

	public static void main(String[] args) {

		
		
		
		int sayi1= 20;
		int sayi2=++sayi1;
		System.out.println("pre-increment sayi 1:"+sayi1);
		System.out.println("pre-increment sayi 2:"+sayi2);
		
		
		sayi2=sayi1++;
		System.out.println("pre-increment sayi 1:"+sayi1);
		System.out.println("pre-increment sayi 2:"+sayi2);
		
		int sayi3=10;
		System.out.println("pre increment :"+ ++sayi3);//11
		System.out.println("post increment :"+ sayi3++);//11
		
		System.out.println("post increment'tan sonra sayi3:"+ sayi3);//12
		
		
		
		
		
	}

}
