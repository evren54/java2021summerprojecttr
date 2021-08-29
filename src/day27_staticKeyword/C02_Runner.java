package day27_staticKeyword;

public class C02_Runner {

	@SuppressWarnings("static-access")//bu main method da static access ile ilgili 
	//isleyisi bozmayan kucuk býr hata var ben bunu onatylýyorum 
	//satir no32--38
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// c1deki variablelara ulaþmak istersem
		//// ilk önce c01 deivariavlelarin insatnce mý static mý olduguna bakmam gerekýr
		// ornegýn sayý ve str nstance variable dýr
		// onlara ulaþmak için obje oluturmam gerekýr

		C01 obj1 = new C01();

		System.out.println(obj1.str);// yasasýn explipse yazdýrýr

		obj1.str = "Yasasin Faruk";
		System.out.println(obj1.str);
		
		
		C01 obj2=new C01();
		
		System.out.println(obj2.str);
		//sayi variable static oldugu icin objeye ihtiyac duyulmaz**************
		//eger variable static ise sadece class ismi yazarým
		System.out.println(C01.sayi2);
		
		C01 obj3=new C01();
		
		obj3.sayi2=27;//CTE VERMEZ
		// CTE vermez... 
        // Ancak altini sari cizer ve satir numarasina unlem koyar
        // Cunku Java daha kisa ve emin bir yol varken nicin obje uzerinden ulastin diye sikayet eder
        // Bu kodun calismasina engel degildir onun icin CTE vermez
        // Fakat gereksiz bir islem oldugundan Java bizi uyarir
		System.out.println(obj3.sayi2);//27
		
		C01.sayi2=34;//stati variavlellara class ismi.variable ismi yazýlarak ulasýlabýlýr
		//bunlara static way denir
		System.out.println(C01.sayi2);//static variablelar ulasabýlen her obje ver her class ýcýn ortaktýr
		// 34 static variable'lar ulasabilen her obje
        // ve her class icin ortaktir
        // okul adi gibi 
		
		
		System.out.println(obj2.sayi2);
		System.out.println(obj1.sayi2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
