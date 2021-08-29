package day22_Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C04_List04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// verilen bir array'de tekrar eden elementleri silip
				// tekrarsiz yeni bir array haline getirin
				
				int arr[]= {2,3,5,7,3,5,2,6,3,1,4,2,3,8,5,10}; // length =13
			List <Integer> sayilar=new ArrayList<>();
			
			for (int i = 0; i < arr.length; i++) {
				if (!sayilar.contains(arr[i])){
				sayilar.add(arr[i]);	
				}
			}
			System.out.println(sayilar);//liste olarak tekrarsýz elementler olusuyor
			Collections.sort(sayilar);
			System.out.println("list olarak tekrarsýz sayýlar :" + sayilar);
			
			
			//yený býr array olusuturup bu elementlerý arraya eklemelýyýz
			//yený array lengthý 7 ý olacak
			
			int yeniArr[]= new int [sayilar.size()];
			for (int i = 0; i < yeniArr.length; i++) {
				yeniArr [i]=sayilar.get(i);
				
				
				
				
				
			}
			
			System.out.println("Tekrarsiz Array :" + sayilar);
			
			
			
	}

}
