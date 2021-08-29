package Day04_increment_matematiksel_islemler;

public class C4_Modulus {

	public static void main(String[] args) {
		// 5496 sayisinin toplamý bulalým
		
		
		int sayi=5496;
		int rakamlarToplami=0;
		// bir sayýnýn rakamlar toplamýný bulmak için her basamak degerinde 3 iþlem
		// yaparýz
		// bu satýrsa sayi=5496, rakamlar toplami=0
		
		
		//1-sayý%10 ile son basamagi elde ederiz
		
		int rakam =sayi %10;//5496 10 a bolundugunde 6 kalýr
		//2-bu rakamý rakamlar toplamýna ekleriz
		rakamlarToplami+=rakam;//6 rklmlr tplm 0 + rkm 6 6 çýkar
		//3-degerþnþ aldýgýmýz son basamakatan kurtulmak için satiti 10 'a bolerýz.
		
		sayi/=10; //5490/10 549
		//bu satira geldigimde sayi=549, rakamlar toplami=6+
		//bu satýra geldigimde sayi=549,rakamlar toplamý=6
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
		
		//kodumuzun sonunda rakamalar toplamý 24 sayi0 oldu
		System.out.println("rakamalar toplami :"+rakamlarToplami);
		System.out.println("Sayinin son degeri:"+ sayi);
		

	}

}
