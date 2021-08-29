package day07_ifStatements;

import java.util.Scanner;

public class c8_NestedIfElse {

	public static void main(String[] args) {
	
		// Kullanicidan cinsiyet ve yas aliniz
        // Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir, 
        // calisan erkekse 65 yasindan buyukse emekli olabilir yazdirin
        // emekli olamayacaksa emekli olamazsin daha ... yil calisman lazim yazdirin
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Lutfen cinsiyet giriniz\n Erkek icin E, Kafýn icin K giriniz ");
	char  cinsiyet=scan.next().toUpperCase().charAt(0);
	
System.out.println("Lutfen Yasýnýzý Tam Sayý Olarak Gýrýnýz");	
int yas= scan.nextInt();
if (cinsiyet=='K') {//KADINSA
	if (yas>=60){
		System.out.println("Emekli olabilirsin");
	} else { System.out.println("Emekli olamazsazin \nDaha "+(60-yas)+ " yil calismalisin");
	}
		
}    
else if(cinsiyet=='E'){ //ERKEKESE
	
	
	if(yas>=65){ System.out.println("Emekli olabilirsin");   }
	else {System.out.println("Emekli olamazsin \nDaha"+ (65-yas)+"yil calismalisin");
} 
	
	



	
	
	
}
}

}
