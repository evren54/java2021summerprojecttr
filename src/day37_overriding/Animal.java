package day37_overriding;

public class Animal {

	public void beslenme() {
		System.out.println("tum hayvanlar eslenýr");
	}
	protected void tatli() {
		System.out.println("trilece");
	}
	protected String icecek() {
		System.out.println("nigde gazozu");
		return "ohhh";
	}
	public Integer topel() {
		return 34+6;
		
	}
	public Animal fatih() {
		return new Animal();
	}
}
