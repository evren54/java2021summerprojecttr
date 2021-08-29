package day34_encapsulation2;

import java.util.Scanner;

public class C02_RentApartmentsMain {
	/* TODO
    Burada iki adet class vardýr. Biri Main diðeri ise rentApartments
    rentApartments'ýn içinde;
    Bu variable'larý private olarak oluþturun;
    String name
    int roomCount
    boolean balconyOrNo
   Bütün variable'lar için getter ve setter oluþturunuz.
    4 farklý Apartment(apartman dairesi) vardýr. 0, 1, 2, 3 rooms(odalý)
    -----------------------------------------------------------------
    Bir method oluþturun;
    Eðer room sayýsý 0 ise,
    rent(kira) 1400
    Eðer oda sayýsý 1 ise,
    rent  1700
    Eðer oda sayýsý 2 ise,
    rent 2200
    Eðer oda sayýsý 3 ise,
    rent 2700
    rent'i return'leyin.
    ----------------------------------------------------------------
    Bir method oluþturun.
    Eðer balconyOrNo  true ise,
    rent'e 200 dollar ekleyin.
    Main class'ýn içinde;
    userName rent is amountOfRent
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("adinizi giriniz  ;");
		String name=scan.nextLine();
		
		System.out.println("dairenizde talep ettiginiz oda sayýsýný giriniz   ;");
		int odaSayisi=scan.nextInt();
		
		System.out.println("balkon tercihinizi giriniz(true/false) ;");
		boolean balcony=scan.nextBoolean();
		
		C01_RentApartments kiraci=new C01_RentApartments();
		
		
		
		kiraci.setName(name);
		kiraci.setBalconyOrNo(balcony);
		kiraci.setRoomCount(odaSayisi);
		int toplamKira=kiraci.balkonSor(balcony)+kiraci.kiraHesapla(odaSayisi);
		
		System.out.println(kiraci.getName()+"bey kira ücretiniz ;"+toplamKira);
		
		
		
		
		
		
	}

}
