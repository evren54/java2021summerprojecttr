package day09_SwitchCase;

public class C4_StringManipulation01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String isim= "Firat";
		String soyisim= "Korkmaz";
		System.out.println(isim +" "+ soyisim);//Firat Korkmaz
		System.out.println(isim.concat(" ").concat(soyisim));//firat korkmaz
		
		System.out.println(isim.charAt(2));//r
		System.out.println(isim.charAt(4));//t
		//System.out.println(isim.charAt(5);// olmayan �ndex yaz�l�rsa java error ver�r� hata
		// ancak Java calismaya basladiktan sonra isim variable'na degeri atiyor
        // ve 5.index'in olmadigini ancak 17.satira gelince farkediyor
        // Bu tur hatalari Java ancak Run ettigimizde farkettigi icin
        // bunlara Run Time Error RTE denir
		
		//int sayi= isim; // biz kodu yazar yazmaz Java Kodu compile (derleme) eder
        // eger syntax hatasi varsa Java bunu hemen farkeder ve altini cizer
        // ve alti cizili bolumu duzeltmeden kodu calistiramayiz
        // compile time error denir CTE

	///	String str="FIRAT";
     ///   System.out.println(str.toLowerCase(Locale.forLanguageTag("tr")));
		
		
	}

}
