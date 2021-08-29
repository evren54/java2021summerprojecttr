package day05_Wrapper_Cocatenation;

public class C2_Concatenation {

	
	public static void main(String[] args) {
		
		String str1="Hello";
		String str2="World";
		int sayi1=3;
		int sayi2=4;
		
		
		//kesinlikle sayý ve harf yazmadan sadece variable isimlerini kullanarak
		
		System.out.println(str1+(sayi2-sayi1));
		
		//Hello 5 World
		
		System.out.println(str1+" "+ ++sayi2+" "+ str2);
		
		
		//hello 34
		
		System.out.println(str1+" "+sayi1+--sayi2);
		
		
		//7World
		
		System.out.println((sayi1+sayi2)+str2);//data turu int
		//34 
		System.out.println(sayi1+""+sayi2);// data turu stringdir
		
		//int String'e çevirmek için metho'a ihtiyac yok ama istersek kullanabýlrýz
		
		
		
		
		}
	
}