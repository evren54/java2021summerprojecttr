package Day04_increment_matematiksel_islemler;

public class C4_Modulus {

	public static void main(String[] args) {
		// 5496 sayisinin toplam� bulal�m
		
		
		int sayi=5496;
		int rakamlarToplami=0;
		// bir say�n�n rakamlar toplam�n� bulmak i�in her basamak degerinde 3 i�lem
		// yapar�z
		// bu sat�rsa sayi=5496, rakamlar toplami=0
		
		
		//1-say�%10 ile son basamagi elde ederiz
		
		int rakam =sayi %10;//5496 10 a bolundugunde 6 kal�r
		//2-bu rakam� rakamlar toplam�na ekleriz
		rakamlarToplami+=rakam;//6 rklmlr tplm 0 + rkm 6 6 ��kar
		//3-deger�n� ald�g�m�z son basamakatan kurtulmak i�in satiti 10 'a boler�z.
		
		sayi/=10; //5490/10 549
		//bu satira geldigimde sayi=549, rakamlar toplami=6+
		//bu sat�ra geldigimde sayi=549,rakamlar toplam�=6
		rakam=sayi%10;
		rakamlarToplami +=rakam;
		sayi/=10;
		//bu satira geldigimde sayi=54 ,rakamlar toplami =15
		rakam=sayi%10;
		rakamlarToplami+=rakam;
		sayi /=10;
		
		//bu satira geldigimde sayi=5,rakamlar toplami=19
		rakam=sayi %10;
		rakamlarToplami +=rakam;
		sayi /=10;
		
		//kodumuzun sonunda rakamalar toplam� 24 sayi0 oldu
		System.out.println("rakamalar toplami :"+rakamlarToplami);
		System.out.println("Sayinin son degeri:"+ sayi);
		

	}

}
