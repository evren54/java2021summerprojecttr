package day31_varrags;

public class C03_Varrags3 {

	public static void main(String[] args) {

		//VER�LEN �NT LERDEN �LK� HAR�C TUM SAYILARI TOPLAYAN VE 
		//BULDUGUNUZ TOPLAM �LE �LK SAY�Y� CARP�P SONUCU YAZDIRIN
		
		
	topla(2,5,55,21,33);
	topla(0,45,35,34);
		
		
	}

	private static void topla(int capilacaksayi, int ...toplanacaklar) {

		int toplam=0;
		
		for (int  each: toplanacaklar) {
			toplam+=each;
			
			
		}
		System.out.println("sonuc :"+(capilacaksayi*toplam));
		
		
		
		
		
		
		
		
		
	}

}
