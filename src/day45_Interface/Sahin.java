package day45_Interface;

public class Sahin extends Tofas implements icDonaným ,lastik {

	@Override
	public void koltuk() {
		System.out.println("deri koltuk yazýn pisirir");
		System.out.println("icinde saman olmasýn yeter");
	}

	@Override
	public void motor() {
		System.out.println("1.6 aile motoruý");

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
	public void kapý() {
		System.out.println("4 kapili");
	}

	@Override
	public void kaporta() {
		System.out.println("kordon gibi kaporta");

	}

	@Override
	public void ebat() {
System.out.println("6 inc lastik ebatý vardýr");		
	}

	@Override
	public void jant() {
		System.out.println("celýk cant kulanýlýr");
		
	}

}
