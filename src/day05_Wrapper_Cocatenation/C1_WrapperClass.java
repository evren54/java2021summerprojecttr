package day05_Wrapper_Cocatenation;

public class C1_WrapperClass {

	public static void main(String[] args) {

		String isim = "Mehmet";
		int sayi = 10;
		System.out.println(isim.charAt(2));// h

		// isim. degigimizde bir �ok method listelenir �unku isim variablen� daha turu
		// Stringdir
		// ve String nono-primitive dir
		// non-prmitivelerde degerin yan�nda methodlar vard�r.
		// sayi. sayi variablen�n data turu int
		// ve int prmitivedir.
		// primitive data turler� value'ya sahiptirler methodlar� yoktur.

		// Java primitive data turler� ivinde methodlar�n kullan�lab�lmes� �c�n
		// her pr�m�t�ve data turu �c�n WrapperClass olusturmustur
		Integer sayi2 = 10;
		System.out.println(sayi2.MAX_VALUE);// int alabilecegi maz deger,2147483647
		System.out.println(sayi2.MIN_VALUE);// int alabilecegi min deger -2147483648

		Short sayi3 = 0;
		System.out.println(sayi3.MAX_VALUE);// 32767
		System.out.println(sayi3.MIN_VALUE);// -32768

		// wRAPPER CLASS KULLANIMINI B�R �RNEK VEREL�M

		String okulNo = "858";
		// Eger String bir variable sadece say�lardan olusuyorsa bu String int'a
		// cev�reb�l�r�z

		int okulNoSayiOlarak = Integer.parseInt(okulNo);
		// System.out.println(okulNo++); okulNo String olarak tan�mad�g� i�in
		// matematiksel islem yap�lamaz

		System.out.println(++okulNoSayiOlarak);

		Character basHarf = 'a';
		System.out.println(basHarf.charValue());// a
		System.out.println(Character.toUpperCase(('a')));
	}

}
