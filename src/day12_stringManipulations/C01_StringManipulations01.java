package day12_stringManipulations;

public class C01_StringManipulations01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="java candir";
System.out.println(str.substring(5));
System.out.println(str.substring(10));
System.out.println(str.substring(11));//lenght hiclik
System.out.println("====");
//System.out.println(str.substring(20));//hata


System.out.println(str.substring(5,8));
System.out.println(str.substring(2,3));
System.out.println(str.substring(5,5));
System.out.println(str.substring(5,11));//candir
//System.out.println(str.substring(5,1));//hata
System.out.println(str.substring(3,4)  + str.substring(8,9));


	}

}
