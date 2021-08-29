package day17_nestedForLoopsWhileLoops;

import java.util.Scanner;

public class C06_WhileLoops04 {

	public static void main(String[] args) {
		
		  /*
        Soru 7 ) Kullanicidan pozitif bir tamsayi alin 
        ve bu sayinin rakamlari toplamini yazdirin
        */
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi = scan.nextInt();
        
        int i=sayi;
        int rakamalartoplami=0;
        int rakam=0;
        
        while (i>0) { 
        	rakam=i%10;
        	rakamalartoplami+=rakam;
        	i/=10;
        	
        }
        System.out.println("girginiz"+sayi+"sayisininin rakamlar toplamý  :" + rakamalartoplami);
        scan.close();
	}
	

}
