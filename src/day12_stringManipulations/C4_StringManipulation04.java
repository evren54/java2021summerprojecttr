package day12_stringManipulations;

import java.util.Scanner;

public class C4_StringManipulation04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
        Soru 5) Kullanicidan 4 harfli bir kelime isteyin 
        4 harften uzun veya kisa ise "lutfen 4 harfli bir kelime girin Yazdirin"
        ve uygun kelime girilirse girilen kelimeyi tersten yazdirin.
    
        */
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen 4 harfl� bir kel�me g�r�n�z");
		String kelime = scan.nextLine();
		
		if (kelime.length()!=4)   {
			System.out.println("lutfen 4 harfl� b�r kel�me g�r�n yaz�n�z");} 
		else {
			 System.out.println(kelime.substring(3, 4) + kelime.substring(2, 3)
             + kelime.substring(1, 2)+ kelime.substring(0, 1));
}
			
			
			
		
	}
	
	

}
