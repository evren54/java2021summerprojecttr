package day08_ternaryOperator;

public class C3_Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sayi = 75;
		String sonuc = sayi % 2 == 0 ? "Sayi cift" : "Sayi tek";

		System.out.println(sayi > 100 ? "Sayi 100'den buyuk" : 10);
		// direkt yazd�rrd�g�m�z zaman sonuclar�n ikisi ayni cinsten olmak zorunda degil

		// String sonuc1 = sayi>100 ? "Sayi 100'den buyuk" : 10;
		// farkl� data turundek� sonuclar �c�n atama yapamay�z

		int y = 1;
		int z = 1;

		int a = y < 10 ? y++ : z++;
		System.out.println(y + "," + z + "," + a); 
	}

}
