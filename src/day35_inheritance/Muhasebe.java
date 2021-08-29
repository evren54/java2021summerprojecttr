package day35_inheritance;

public class Muhasebe extends Personel {

	public String statu;
	public int saatucreti;
	public int maas;
	
	public int maasHesapla() {
		
		maas=saatucreti*8*30;
		
		return maas;
	}
	}