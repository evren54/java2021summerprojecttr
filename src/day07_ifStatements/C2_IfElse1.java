package day07_ifStatements;

import java.util.Scanner;

public class C2_IfElse1 {

	public static void main(String[] args) {
//soru 1 kullanicidan dikd�rtgenin kenar uzunluklar�n� �stey�n
		// ve dikd�rtgenin kare olup olmad�g�n� yazd�r�n
		
		Scanner scan=new Scanner(System.in);
		
	System.out.println("Lutfen dikd�rtgenin kenarlar�n� girniz\nIlk kenar� yazinca ENTER'a basiniz");
	
	double kenar1=scan.nextDouble();
	double kenar2=scan.nextDouble();
	
	if (kenar1==kenar2) { System.out.println("girdiginiz dikdortgen kare");}else {
	System.out.println("girdiginiz dikdortgen kare degil");
}
	
	
	}
	}