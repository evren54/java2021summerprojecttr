package day25_constructor;

public class C03 {

	
int sayi=10;
String isim="Mehmet";
//ayni package daki farkli class'lardan bu variable'lara ulasabiliriz
// cunku access modifier yazmazsak default access modifier kullanilir
// access modfier default ise ayni paketten heryerden kullanilabilir

public static void main(String[] args) {
	
	//sayi=20;sayi degiskeni static olmad�g� icin main method dan kullanamam
	//deneme(;) deneme method� static olmad�g� icin main method dan ca�gramam
	
	C03 obj1=new C03();
	obj1.deneme();
	// ayn� class da oldugumuz halde static olmad�g� �c�n kullanamad�g�m�z variableve metohlar� obje olusturarak kullanab�l�r�z
	
	
	
}

	public void deneme( ) { 
		System.out.println("deneme methodu calisti");
	}

}
