package day37_overriding;

public class Dog extends Animal {
	@Override//Annotation-->mutlaka childe yaz�l�r. parent ve child meethodlar�nda iliski kurar
	//zab�ta g�b� �k� method aras�nda �ul�sk�y� duzenler
public void beslenme() {
	System.out.println("kem�k �le beslen�r");
}

	@Override
	public void tatli() {
		System.out.println("fistik sarma");
	}

	@Override
	protected String icecek() {
		System.out.println("tursu suyu");
		return " yasasin";
		
	}

	@Override
	public Integer topel() {
		return 41+54;
		
	
	
}

	@Override
	public Animal fatih() {

return new Dog();
	}
	
}
