package day10_stringManipulations;

public class C2_stringManupulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		String str = "java guzeldir";
		
		System.out.println(str.length());//13
	
	String str2="";
	System.out.println(str2.length());//0
	
	str=null;
	///System.out.println(str2.length());//hata veriri
	//str ýn son harfinin index'i nedir
	//str in uzunlugu 13 
	//son harfin indexi 12
	
	String str3= "sjdhsjdsddddddddddddddddddddddfdgdrfdfdsdsdsdsfgdder";
	
	//str3'un son harfiniin indexi ==>str.length()-1
	
	System.out.println(str3.length()-1);
	
	
	
	}

}
