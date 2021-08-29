package day11_stringManipulations;

public class C04_StringManipulation04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String kkNo= " Java 123 @#";
		
		
		
		System.out.println(kkNo.replace(" ", ""));
		System.out.println(kkNo); // 1234 5413 3652 4785  yoksa 1234541336524785
		
		
		///replaceAll()
		System.out.println(kkNo.replaceAll("\\s", ""));//s sadece space
		System.out.println(kkNo.replaceAll("\\s", "*"));// s sadece space
		System.out.println(kkNo.replaceAll("\\S", "*"));//space olmayan hersey
		System.out.println(kkNo.replaceAll("\\w", "-"));//harf ve rakamalarýn hepsi
		System.out.println(kkNo.replaceAll("\\W", "#"));//harf ve ramalar dýsýnda hersey
		System.out.println(kkNo.replaceAll("\\d", "0"));//digit rakamalrýn hepsi
		System.out.println(kkNo.replaceAll("\\D", "a"));//digit rakamalrýn dýsýndaký hersey
		
		System.out.println(kkNo.replaceAll("\\w", "-"));
		
		// syso icinde yapilan manipulation'lar asil String'i degistirmez
		
System.out.println(kkNo);
        
        kkNo = "1234 5698 1278 5687"; // atama yapinca kalici olarak degistirmis oluruz
        System.out.println(kkNo);
		}

}
