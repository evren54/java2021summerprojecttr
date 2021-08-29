package day22_Arraylist;

import java.util.ArrayList;
import java.util.List;

public class C06_List06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 100'den buyuk ilk 20 fibonacci sayisini list olarak yazdirin
	
		List<Integer> fibonacci=new ArrayList<>();
		List<Integer> istenensayilar = new ArrayList<>();
	fibonacci.add(0);
	fibonacci.add(1);
	
	int count=0;
	int sayi=0;	
	int i=1;
	
	do {
		sayi=fibonacci.get(i-1)+fibonacci.get(i);
		fibonacci.add(sayi);
		
		
		if(sayi>100) {
			istenensayilar.add(sayi);
			count++;
			
		}
		i++;
	}while(count<=20);
	
	System.out.println(istenensayilar);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
