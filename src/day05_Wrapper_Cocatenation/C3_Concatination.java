package day05_Wrapper_Cocatenation;

public class C3_Concatination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int sayi=7;
		char ilkHarf='a';
		String str="Java";
				
		System.out.println(sayi+str+ilkHarf);
		System.out.println(sayi+ilkHarf+str);
				
		
	//7a
		
		System.out.println(sayi+ilkHarf);// char a n�n aask� degeri 97  d�r oun i�in bu sonuc c�kar,
		System.out.println(""+sayi+ilkHarf);
	}

}
