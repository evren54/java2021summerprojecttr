package day27_staticKeyword;

public class C03_Static_Keyword {

	
	
	static int sayi=35;
	String str="Java";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*
        bir method veya variable'i static yapmanin avantaji :
        
        Static variable ve method'lara ulasmak istedigimizde classIsmi.methodIsmi yazmamiz
        yeterli olur.
        
         Ornegin array'lerde kullandigimiz Arrays class'i altindaki toString( ) method'u 
         static olarak java developerlari tarafindan hazirlanmis oldugu icin 
         Arrays.toString( ) yazarak method'u rahatlikla kullanabiliyoruz
         
         Ancak variable'lari static yapmak biraz riskli
         Mesela bir okul uygulamasinda okul ismini static variable olarak olusturursak 
         avantaj olarak heryerden rahatlikla okul ismine ulasabiliriz
         
         ama ogrenci objelerinden veya ogretmen objelerinden biri uzerinden okul adi degistirilirse 
         tum ogrenciler ve tum ogretmenler icin okul adi kalici olarak degismis olur
         ve bu da bir uygulama icin istenmeyen bir durumdur.
        */
		
		sayi=20;
		//str="static olan main methoddan instance variable direkt ulasamaayýz"
		
		
		staticMethod();
		//staticOlmayanmMethod();// main method static oldugu icin static olmayan method'u cagiramayiz
		
	}
	public static void staticMethod() {
		
		System.out.println("Static variablelar gokteký ay gýbýdýr");
		sayi=30;
		//str ="Buradan ulasýlamaz
				
	}
public void staticOlmayanmMethod() {
	System.out.println("Static olmayan method calýstý");
	
	staticMethod();//static method heryerden cagýralbýlýr
	sayi=25;//// static variable'lara her yerden ulasilabilir ve deger atanabilir
    str="static olmayan method'dan static olmayan variable'a ulasabilirim";
}
}
