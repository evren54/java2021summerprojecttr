package day41_exception01;

public class Exception05 {
public static void main(String[] args) {
	String str1=" ";//space
	String str2="";//hýclýk
	String str3=null;//str3 degrýnýn hýc býr degere esýt olmadýgýný belýrten ppoýnter(belýrtec-ýsaretcý)
					// null býr deger degýldýr ama consola yazdýrýrlýr
	
	
	
	System.out.println(str1.length());//1
	System.out.println(str2.length());//0
	//System.out.println(str3.length());//NullPointerException ucnhecked-kendýmýz ettýk kendýmýz bulduk hatasý 
	//System.out.println(str3.concat("erol tas)); // null olarak atanmýs bir obj uygun olmauan nbýr ýslem hata yapýlýrsa 
	//java null pointerexception hatasý verýur
	
	
	

}
}
