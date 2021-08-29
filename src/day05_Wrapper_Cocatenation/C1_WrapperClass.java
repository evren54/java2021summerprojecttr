package day05_Wrapper_Cocatenation;

public class C1_WrapperClass {

	public static void main(String[] args) {

		String isim = "Mehmet";
		int sayi = 10;
		System.out.println(isim.charAt(2));// h

		// isim. degigimizde bir çok method listelenir çunku isim variablený daha turu
		// Stringdir
		// ve String nono-primitive dir
		// non-prmitivelerde degerin yanýnda methodlar vardýr.
		// sayi. sayi variablenýn data turu int
		// ve int prmitivedir.
		// primitive data turlerý value'ya sahiptirler methodlarý yoktur.

		// Java primitive data turlerý ivinde methodlarýn kullanýlabýlmesý ýcýn
		// her prýmýtýve data turu ýcýn WrapperClass olusturmustur
		Integer sayi2 = 10;
		System.out.println(sayi2.MAX_VALUE);// int alabilecegi maz deger,2147483647
		System.out.println(sayi2.MIN_VALUE);// int alabilecegi min deger -2147483648

		Short sayi3 = 0;
		System.out.println(sayi3.MAX_VALUE);// 32767
		System.out.println(sayi3.MIN_VALUE);// -32768

		// wRAPPER CLASS KULLANIMINI BÝR ÖRNEK VERELÝM

		String okulNo = "858";
		// Eger String bir variable sadece sayýlardan olusuyorsa bu String int'a
		// cevýrebýlýrýz

		int okulNoSayiOlarak = Integer.parseInt(okulNo);
		// System.out.println(okulNo++); okulNo String olarak tanýmadýgý için
		// matematiksel islem yapýlamaz

		System.out.println(++okulNoSayiOlarak);

		Character basHarf = 'a';
		System.out.println(basHarf.charValue());// a
		System.out.println(Character.toUpperCase(('a')));
	}

}
