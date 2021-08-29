package day22_Arraylist;

import java.util.ArrayList;
import java.util.List;

public class C01_List01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> isimler=new ArrayList<>();
		isimler.add("Ali");
		System.out.println(isimler);
		//add metodu listenýn sonuna ekleme yapar
		isimler.add("veli");
		isimler.add("ayse");
		isimler.add("mehmet");
		isimler.add("cemal");

		System.out.println(isimler);
		
		//ozel bir e-ýndex e eklemek ýstersenýz ýdexlý add metodu kullanmak zorundasýnýz 
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
		
		//bir de int elemenlerin odugu být lýste olusturalým
		List<Integer> sayilar=new ArrayList<>();//i nteger wrapper class ve nonprimitivedir
		sayilar.add(5);
	//yeni liste sayýlar lýstý ekleyebýlýr mýyým
		//farklý býr data turunden lýste ve element ekleyemeyýz
		
		
		///yeniList.addAll(sayilar);
	}

}
