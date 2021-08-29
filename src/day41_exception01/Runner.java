
package day41_exception01;

import java.util.Scanner;

public class Runner {
public static void main(String[] args) throws InvalidEmailIdCheckedException {
	
	
	Scanner scanner=new Scanner(System.in);
	
			System.out.println("emaýl gýrýnýz :");
	
	String email= scanner.nextLine();
	
	if (email.contains("@gmail.com") ||email.contains("@hotmail.com"))
	{
	System.out.println("basarýlý");}  
	
	
	else
	{
	
	throw new day41_exception01.InvalidEmailIdCheckedException ("neyin kafasý bu, ");

	
	
	
	
	
	
	
	
	}
	
}
}
