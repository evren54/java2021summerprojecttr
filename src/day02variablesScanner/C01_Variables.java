package day02variablesScanner;

public class C01_Variables {

	public static void main(String[] args) {
		
		// 1-Farklý 3 data turunde variable olusturuen mutlaka ve bunlarý yazdýrýn
		String kelime = "Merhaba"; // satirdaki kod sonunda mutlaka ; kullanýlýr
		System.out.println(kelime); // kelimenin variable oldugu anlar ve variable 'in degerini yazdirir
		System.out.println("kelime");// kelime yazdirir
		
		int sayi=1000;
		System.out.println( sayi   ); //20
		// yazdidirirken  basina aciklama eklemek istersen 
		//girilen sayi :20 
		// eger degisken ve aciklamayi birlikte yazdirmak istersek
		//"acýklama " + variableIsmi
		
		System.out.println("girilen sayi : " + sayi);
		
		boolean tatildeMi = true;
		
		System.out.println(tatildeMi);
		// konsolda bu sene tatile gittiniz mi ? = true
	// variabledan gelen kýsým :
		
		System.out.println("bu sene tatile gitiniz mi ? =" +tatildeMi);

		
		/*
        2- isim ve soyisim icin iki variable olusturun ve bunlari 
               isminiz : Mehmet
               soyisminiz : Bulut 
               seklinde yazdirin
        */
		
		
		 String name="Mehmet";
	        String surname="Bulut";
	        
	        System.out.println( "isminiz : "+ name);
	        System.out.println("soyisminiz : " + surname);
		
	        // 3- Iki farkli tamsayi data turunde 2 variable olusturun bunlarin toplamini yazdirin
	        int sayi1 = 10 ;
	        byte sayi2 = 5;
	        
	        
	        System.out.println(  sayi1 + sayi2     );
		
	        // toplama islaminin basina aciklama yazmak istersek
	        
	        // iki sayinin toplami = 15 
	        
	        System.out.println("iki sayinin toplami = " + (sayi1 + sayi2));
	        
	        // String ve sayisal islemleri birlikte yaptirdigimizda matematiksel islemi parantez icine alin
	         
	        
	        // 4- Bir tamsayi ve bir ondalikli variable olusturun ve bunlarin toplamini yazdirin
	        int sayi3 = 15;
	        double sayi4 = 3.008 ;
	        
	        System.out.println(sayi3 + sayi4 );
	        
	        // toplam : 18.008
	        
	        System.out.println("toplam : " + (sayi3 +sayi4));
	        
	        
	        // 5 – char data turunde bir variable olusturun ve yazdirin
	        char karakter = '?'; 
	        
	        System.out.println(karakter);
	        System.out.println("Girilen karakter : " + karakter);
	        
	        
	        
	        // 6- Bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdirin.
	        
	        int sayi5=20;
	        char harf='M';
	        
	        System.out.println( harf + sayi5 ); // 20M
	        // char data turundeki degiskenler matematiksel islemlerde kullanilirsa ASCII tablosu devere girer
	        // Java o karakter yerine ASCII tablosundaki degeri kullanir
		
	}

}
