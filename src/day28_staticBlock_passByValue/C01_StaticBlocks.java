package day28_staticBlock_passByValue;

public class C01_StaticBlocks {
	
static int sayi=10;
static   {
	System.out.println("static block calisti");
	sayi=20;
	
	
}

static   {
	System.out.println("1.5 static block calisti");
	sayi=15;
}
static   {
	System.out.println("2.static block calisti");
	sayi=30;// bir den fazla static blok varsa yukar�dan sag� dogru cal�r� 
	//sonuncu static block degeri ele al�n�r
}

static   {
	System.out.println("me�n method dan sonrak� static block cal�st�");
	sayi=445;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println("main method ilk satirinda sayi;" +sayi);//
		
		
		
	}

}
