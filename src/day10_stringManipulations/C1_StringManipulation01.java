package day10_stringManipulations;

public class C1_StringManipulation01 {
	public static void main(String[] args) 
		
	{
	String name1= "Ali Can";
	String name2= "Ali Can";
	String name3=name2 +"";     //space yok
	String name4= "Ali";
	String name5= "Can";
	String name6= name4 + " " +name5;//ali can
	
System.out.println(name1.equals(name2));
System.out.println(name1.equals(name3));
System.out.println(name3.equals(name6));

//ilk uc karsýlastýmada degerler ayný oldugu ýcýn sonuc ayný olýur
	
System.out.println(name1==name2);
System.out.println(name1==name3);
System.out.println(name3==name6);
	
// farkli objeler ayni degeri aldiginda java referanslara bakar
// bu referanslar ayni ise == true dondurur, yoksa false dondurur

// degerleri karsilastirmak ve supriz yasamamk istiyorsaniz equals() kullanmalisiniz

   String name7= "Ali Can";
   String name8= "Ali CAn";
   String name9= "ali can";
   String name10= "AlilCan";
   System.out.println(name1.equals(name8));//false
   System.out.println(name1.equalsIgnoreCase(name9));//true
   
   System.out.println(name7.equalsIgnoreCase(name9));//true
   System.out.println(name8.equalsIgnoreCase(name10));//true


	}
	
	
	
	
}
