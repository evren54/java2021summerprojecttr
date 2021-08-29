package day21_multiDimensionalArrays;

import java.util.Iterator;

import javax.print.attribute.standard.PrinterMessageFromOperator;

public class C02_MDArrays02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Soru 1 ) Asagidaki multi dimensional array’in tum elemanlarinin
		// carpimini ekrana yazdiran bir method yaziniz.
		// { {1,2,3}, {4,5,6} }
		
		
		int arr [][]={ {1,2,3}, {4,5,6},{4,5,6,7,8,9},{5,2,0}};
		
		int carpim=1;
		for (int i = 0; i < arr.length; i++) {//outer array icin
			for (int j = 0; j < arr[i].length; j++) {
				
				carpim*=arr[i][j];
			}
			
		}
		System.out.println("tum elementlerýn carpimi :"+carpim);
		
		
		
	}

}
