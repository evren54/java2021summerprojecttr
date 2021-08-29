package day40_Overriding02;

public class Otobus extends Arac{
	 // 1- Arac isimli bir superclass olusturunuz, fields : renk ve motor(private), model(protected) olsun.
    // 2- Consructor ekleyiniz.get ve set metodlar� ve toString Metodunu ekleyiniz.
    // 3- Arac s�n�ftan  Otobus s�n�f�n� �retiniz, otobusun ayr�ca yolcuSayisi field �n� ekleyiniz.
    // 4- Bir AracPark isimli i�inde main olan bir s�n�f olusturunuz ve Otobus ten
    //    obj olu�turarak, Otobusun �zelliklerinin t�m�n� ekrana yazd�r�n�z.
   
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
