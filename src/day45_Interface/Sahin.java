package day45_Interface;

public class Sahin extends Tofas implements icDonan�m ,lastik {

	@Override
	public void koltuk() {
		System.out.println("deri koltuk yaz�n pisirir");
		System.out.println("icinde saman olmas�n yeter");
	}

	@Override
	public void motor() {
		System.out.println("1.6 aile motoru�");

	}

	@Override
	public void yakit() {
		System.out.println("tup takmazsan cok yakar");
	}

	@Override
	public void ayna() {
		System.out.println("elektirkli aynalar");
	}

	@Override
	public void kap�() {
		System.out.println("4 kapili");
	}

	@Override
	public void kaporta() {
		System.out.println("kordon gibi kaporta");

	}

	@Override
	public void ebat() {
System.out.println("6 inc lastik ebat� vard�r");		
	}

	@Override
	public void jant() {
		System.out.println("cel�k cant kulan�l�r");
		
	}

}
