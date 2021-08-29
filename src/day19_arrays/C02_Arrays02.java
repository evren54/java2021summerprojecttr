package day19_arrays;

import java.util.Arrays;

public class C02_Arrays02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]=new int [5];
System.out.println(Arrays.toString(arr));//0,0,0,0

// ben bir kez olusturdugum in sonradan uzunlugunu degistirebilir miyim ?

// [0, 0, 0, 0, 0, 5]

// arr[5]=5;


// array'in length'i sonradan degistirilemez
// array'i kullanissiz yapan da bu ozelligidir

arr[3]=6;
System.out.println(Arrays.toString(arr));

arr = new int [6];// bu ekleme yapmaz,deger olarak 6 elemntlik yeni bir array 
System.out.print(Arrays.toString(arr));

//ARRAY'in length'i DEGISTIRILEMEZ................

	}

}
