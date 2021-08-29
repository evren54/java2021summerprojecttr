package day33_encapsulation;

public class C03_ArabaMain {
public static void main(String[] args) {//4.step class
	//5.step alt satýrlar consturctorlar
	C04_Araba volvo=new C04_Araba("xc90","beyaz",-2400,-2020);
	C04_Araba audi=new C04_Araba("Q7","BEJ",-3000,-2021);
	C04_Araba honda=new C04_Araba();//DEFAULT PARAMETRESÝZ CONS VAR IKEN
	
	
	honda.model="accord";
	honda.renk="gri";
	honda.setYil(1999);
	honda.setMotor(1400);
	
	System.out.println("honda yil ;" +honda.getYil());
	System.out.println("honda motor ;" +honda.getMotor());
System.out.println("volvo motor  :"+volvo.getMotor());
System.out.println("audi yil :"+audi.getYil());
	
	/*
	 * this.model = model;
		this.renk = renk;
		this.motor = motor;
		this.yil = yil;
	 */
}
}
