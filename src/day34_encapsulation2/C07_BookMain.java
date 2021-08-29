package day34_encapsulation2;

import java.util.Scanner;

public class C07_BookMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
C07_Book kitap=new C07_Book();

Scanner scan=new Scanner (System.in);
System.out.println("son okudugunuz kýtabý gýrýnýz");
String kitap2=scan.nextLine();
kitap.setBookName("calikusu");
kitap.setAuthorName("kitap2");
	System.out.println("1.  kitabým :"+kitap.getBookName()+"ikinci kitabým :"+kitap.getAuthorName());
		
	}

}
