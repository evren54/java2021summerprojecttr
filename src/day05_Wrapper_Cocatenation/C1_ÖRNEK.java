package day05_Wrapper_Cocatenation;

public class C1_ÖRNEK {

	public static void main(String[] args) {

		String isim = "Cemal";
		int sayi = 10;

		System.out.println(isim.charAt(2));

		Integer sayi2 = 10;
		System.out.println(sayi2.MAX_VALUE);
		System.out.println(sayi2.MIN_VALUE);

		Short sayi3 = 0;
		System.out.println(sayi3.MAX_VALUE);
		System.out.println(sayi3.MIN_VALUE);

		String okulNo = "636";
		int okulNoSayiOlarak = Integer.parseInt(okulNo);
		System.out.println(++okulNoSayiOlarak);

		Character basHarf = 'a';
		System.out.println(basHarf.charValue());
	}

}
