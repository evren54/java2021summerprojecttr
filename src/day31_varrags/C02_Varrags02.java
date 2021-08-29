package day31_varrags;

public class C02_Varrags02 {

	private static final String[] String = null;

	public static void main(String[] args) {
		 // Varargs kullanarak verilen Stringleri birlestiren concat isimli bir method
        // olusturunuz
		
		
		concat("m","e","r","v","e");
	
		
	
	}

	private static void concat(String...string) {
		// TODO Auto-generated method stub
		 String s = "";
	        for (String w : string) {
	            s = s.concat(w);
	        }
	        System.out.println(s);
	}

}
