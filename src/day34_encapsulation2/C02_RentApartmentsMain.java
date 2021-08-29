package day34_encapsulation2;

import java.util.Scanner;

public class C02_RentApartmentsMain {
	/* TODO
    Burada iki adet class vard�r. Biri Main di�eri ise rentApartments
    rentApartments'�n i�inde;
    Bu variable'lar� private olarak olu�turun;
    String name
    int roomCount
    boolean balconyOrNo
   B�t�n variable'lar i�in getter ve setter olu�turunuz.
    4 farkl� Apartment(apartman dairesi) vard�r. 0, 1, 2, 3 rooms(odal�)
    -----------------------------------------------------------------
    Bir method olu�turun;
    E�er room say�s� 0 ise,
    rent(kira) 1400
    E�er oda say�s� 1 ise,
    rent  1700
    E�er oda say�s� 2 ise,
    rent 2200
    E�er oda say�s� 3 ise,
    rent 2700
    rent'i return'leyin.
    ----------------------------------------------------------------
    Bir method olu�turun.
    E�er balconyOrNo  true ise,
    rent'e 200 dollar ekleyin.
    Main class'�n i�inde;
    userName rent is amountOfRent
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("adinizi giriniz  ;");
		String name=scan.nextLine();
		
		System.out.println("dairenizde talep ettiginiz oda say�s�n� giriniz   ;");
		int odaSayisi=scan.nextInt();
		
		System.out.println("balkon tercihinizi giriniz(true/false) ;");
		boolean balcony=scan.nextBoolean();
		
		C01_RentApartments kiraci=new C01_RentApartments();
		
		
		
		kiraci.setName(name);
		kiraci.setBalconyOrNo(balcony);
		kiraci.setRoomCount(odaSayisi);
		int toplamKira=kiraci.balkonSor(balcony)+kiraci.kiraHesapla(odaSayisi);
		
		System.out.println(kiraci.getName()+"bey kira �cretiniz ;"+toplamKira);
		
		
		
		
		
		
	}

}
