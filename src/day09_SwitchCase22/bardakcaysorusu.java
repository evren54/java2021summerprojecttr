package day09_SwitchCase22;

import java.util.Scanner;

public class bardakcaysorusu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Kullan�c�ya g�nde ne kadar �ay i�ti�ini ve ne kadar �eker kulland���n� sorun.
		 * Y�lda ka� kg �eker kulland���n� hesaplay�n ve yazd�r�n.
		 * 1 �eker = 1.7 gr
		 * �rnek ��kt�:
		 * Y�lda 12.41 kg �eker kullan�yor.
		 */
      Scanner scan=new Scanner(System.in);
   System.out.println("Gunder ka� bardak �ay i�ersiniz");
   int gunlukBardak=scan.nextInt();
   System.out.println("B�r bardakta ne kadar seker kullan�rs�n�z");
   int sekeradet=scan.nextInt();
   double birseker=1.7;
   
   
   System.out.println("Yilda"+(gunlukBardak*sekeradet*birseker*365)/1000+" kg �eker kullan�yor");

		
		
		
		
		
		
		
	}

}
