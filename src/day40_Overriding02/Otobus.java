package day40_Overriding02;

public class Otobus extends Arac{
	 // 1- Arac isimli bir superclass olusturunuz, fields : renk ve motor(private), model(protected) olsun.
    // 2- Consructor ekleyiniz.get ve set metodlarý ve toString Metodunu ekleyiniz.
    // 3- Arac sýnýftan  Otobus sýnýfýný üretiniz, otobusun ayrýca yolcuSayisi field ýný ekleyiniz.
    // 4- Bir AracPark isimli içinde main olan bir sýnýf olusturunuz ve Otobus ten
    //    obj oluþturarak, Otobusun özelliklerinin tümünü ekrana yazdýrýnýz.
   
	int yolcuSayisi;

	public Otobus(String renk, double motor, String model, int yolcuSayisi) {//parentten gelecek fields 
		super(renk, motor, model);
		this.yolcuSayisi = yolcuSayisi;
	}

	@Override
	public String toString() {
		return "Otobus [yolcuSayisi=" + yolcuSayisi + ", model=" + model + ", getRenk()=" + getRenk() + ", getMotor()="
				+ getMotor() + ", getModel()=" + getModel() + ", getClass()="  + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
}
