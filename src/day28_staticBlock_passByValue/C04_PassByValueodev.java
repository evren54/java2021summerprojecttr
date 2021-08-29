package day28_staticBlock_passByValue;

public class C04_PassByValueodev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fiyat =100;
		
		/*
		 * indirim10();
		indirim20();
		indirim25();
		 */
		System.out.println("Method10'da hesapalanan fiyat ;"+indirim10(fiyat));
		System.out.println("Method20'da hesapalanan fiyat ;"+indirim20(fiyat));
		System.out.println("Method25'da hesapalanan fiyat ;"+indirim25(fiyat));
		System.out.println("method call sonrasi fiyat ;" +fiyat);
	}

	private static int indirim10(int fiyat) {
		fiyat*=0.90;
		return fiyat;
		
	}

	private static int indirim20(int fiyat) {
		fiyat*=0.80;
		return fiyat;
		
	}

	private static int indirim25(int fiyat) {
		fiyat*=0.75;
		return fiyat;
		
	}

}
