package day09_SwitchCase;

import java.util.Scanner;

public class C3_SwitchCase03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Soru5 : Kullanicidan gun ismini alip haftaici veya hafta sonu yazdiralim
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir gun �sm� g�r�n�z");

		String gun =scan.next().toLowerCase();
				
		switch(gun) { 
        case "pazartesi	 ":
		case "sali":
		case "carsamba":
		case "persembe":
		case "cumar":
			System.out.println("g�rd�g�n�z gun hafta �c�");
			break;
		case "cumartesi":
		case "pazar":
			System.out.println("g�rd�n�z gun haftasonu");
			break;
			
			default:
				System.out.println("lutfen gecerl� b�r gun �sm� g�r�n�z");
		
		
		}
		
	}

}
