package day22_Arraylist;

import java.util.ArrayList;
import java.util.List;

public class C01_List01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> isimler=new ArrayList<>();
		isimler.add("Ali");
		System.out.println(isimler);
		//add metodu listen�n sonuna ekleme yapar
		isimler.add("veli");
		isimler.add("ayse");
		isimler.add("mehmet");
		isimler.add("cemal");

		System.out.println(isimler);
		
		//ozel bir e-�ndex e eklemek �stersen�z �dexl� add metodu kullanmak zorundas�n�z 
		isimler.add(3,"nihan");
		System.out.println(isimler);
		isimler.add(0,"Memet");
		System.out.println(isimler);
		
		List <String> yeniList=new ArrayList<>();
		yeniList.add("Firat");
		System.out.println(yeniList);
		//yenilist sonuna isimler listesinin eklemek istersek
		yeniList.addAll(isimler);
		System.out.println(yeniList);
		
		//bir de int elemenlerin odugu b�t l�ste olustural�m
		List<Integer> sayilar=new ArrayList<>();//i nteger wrapper class ve nonprimitivedir
		sayilar.add(5);
	//yeni liste say�lar l�st� ekleyeb�l�r m�y�m
		//farkl� b�r data turunden l�ste ve element ekleyemey�z
		
		
		///yeniList.addAll(sayilar);
	}

}
