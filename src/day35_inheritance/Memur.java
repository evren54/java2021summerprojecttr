package day35_inheritance;

public class Memur extends Muhasebe{
private String soyIsim;
private int saatUcreti;

public static void main(String[] args) {
	Memur m1= new Memur();
	Memur m2= new Memur();
	
	m1.isim="Cumali";
	m1.soyIsim="korkmaz";
	m1.adres="falan feşmekan";
	m1.saatUcreti=20;
	m1.statu="chef";
	m1.tel="12345";
	m1.id=m1.idAta();
	m1.maas=m1.maasHesapla();
	System.out.println(m1.isim + "\n" + m1.soyIsim+  "\n" +m1.tel+ "\n" + m1.adres + "\n" + m1.saatUcreti + "\n" +m1.id + "\n" + m1.maas);
	
}

}
