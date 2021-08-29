package day09_SwitchCase22;

import java.util.Scanner;

public class deneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner (System.in);
		System.out.println("lutfen bir metin giriniz");
		String metin=scan.nextLine();
		String ters=" ";
		
		
		for (int i= metin.length()- 1; i>= 0;i--) {
			ters+=metin.charAt(i);
			
			
		}
		System.out.println("girdiginiz metnin tersi ;\n"+ters);
	}

}
