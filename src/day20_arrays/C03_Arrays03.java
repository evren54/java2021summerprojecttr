package day20_arrays;

import java.util.Arrays;

public class C03_Arrays03 {

	public static void main(String[] args) {
		// Java,candir.
		String str = "Java,candir";
		// split method'u bize bir array doner
		// donen array'i ya direk yazdirmaliyiz
	
		System.out.println(Arrays.toString(str.split(",")));

// veya method'dan donen String barindiran bir array oldugundan
// bir array olusturup ona assign edebiliriz

		String bolunmusKelimeArray[] = str.split(",");
		System.out.println(bolunmusKelimeArray[1]);

		
		String bolunmusKelimeArray2[] = str.split("a");
		System.out.println(Arrays.toString(bolunmusKelimeArray2));
System.out.println(bolunmusKelimeArray2.length);//4

String bolunmusKelimeArray3[]=str.split("");
System.out.println(Arrays.toString(bolunmusKelimeArray3));

String cumle="Java ogen, rahat yasa";
String KelimeArrayi[]=cumle.split(" ");
System.out.println("cumledeký kelýme sayýsý :" +KelimeArrayi.length);

	
	String cumle2=cumle.replaceAll("\\W", "");
	System.out.println(cumle2);
	System.out.println(cumle2.length());
	

	String harfArrayi[]=cumle2.split("");
	System.out.println(harfArrayi.length);
	
	
	}

}
