package day09_SwitchCase22;

import java.util.Scanner;

public class karealan_ve_cevre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Kullan�c�dan karenin kenar uzunlu�unu al�n ve karenin alan�n� ve �evresini konsola yazd�ran bir program yaz�n.

Ornek Cikti :

Alan: 9

Cevre: 12
 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" lutfen karen�n bir kenar�n�  g�r�n�z");
		int kenar1=scan.nextInt();
		
		int alan=kenar1*kenar1;
		int cevre=kenar1*4;
				
		System.out.println("Alan : " + alan);
		System.out.println("Cevre :" + cevre);
	}

}
