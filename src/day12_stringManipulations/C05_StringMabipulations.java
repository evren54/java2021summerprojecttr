package day12_stringManipulations;

public class C05_StringMabipulations {

	public static void main(String[] args) {
		/*
		 * Soru 2) String seklinde verlen asagidaki fiyatlarin toplamini bulunuz String
		 * str1 = “$13.99” String str2 = “$10.55” ipucu : Double.parseDouble() methodunu
		 * kullanabilirsiniz.
		 */
		String str1 = "$13.99";
		String str2 = "$10.55";
		str1 = str1.replace("$", "");
		str2 = str2.replace("$", " ");
		System.out.println(str1 + str2);//$ dan kurtulduk ama hala strýng ve concetanation yaptý bouble yapacagým
		
		double sayi1=Double.parseDouble(str1);
		double sayi2=Double.parseDouble(str2);
		
		System.out.println("iki sayinin toplemý :$"+ (sayi1+sayi2));

	}

}
