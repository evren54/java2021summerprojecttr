package day09_SwitchCase22;

import java.util.Scanner;

public class dikd�rtgeningalan� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Kullan�c�dan dikd�rtgenin kenar uzunluklar�n� al�n ve dikd�rtgenin alan�n� ve �evresini konsola yazd�ran bir program yaz�n.

�rnek ��kt�:

Alan: 32

�evre: 24
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println(" Lutfen dikdortgen�n k�sa kenar�n� uzunlugunu g�r�n�z");
		int kk=scan.nextInt();
		System.out.println("lutfen dikdortgen�n uzun kenar�n� g�r�n�z");
		int uk=scan.nextInt();
		
		int alan=kk*uk;
		int cevre=2*(kk+uk);
		
		System.out.println("Dikd�rtgenin alani : " +alan);
		System.out.println("Dikd�rtgenin cevresi : " +cevre);
	}

}
