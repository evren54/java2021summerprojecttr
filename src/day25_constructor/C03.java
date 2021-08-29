package day25_constructor;

public class C03 {

	
int sayi=10;
String isim="Mehmet";
//ayni package daki farkli class'lardan bu variable'lara ulasabiliriz
// cunku access modifier yazmazsak default access modifier kullanilir
// access modfier default ise ayni paketten heryerden kullanilabilir

public static void main(String[] args) {
	
	//sayi=20;sayi degiskeni static olmadýgý icin main method dan kullanamam
	//deneme(;) deneme methodý static olmadýgý icin main method dan caýgramam
	
	C03 obj1=new C03();
	obj1.deneme();
	// ayný class da oldugumuz halde static olmadýgý ýcýn kullanamadýgýmýz variableve metohlarý obje olusturarak kullanabýlýrýz
	
	
	
}

	public void deneme( ) { 
		System.out.println("deneme methodu calisti");
	}

}
