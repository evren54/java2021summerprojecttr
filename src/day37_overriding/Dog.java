package day37_overriding;

public class Dog extends Animal {
	@Override//Annotation-->mutlaka childe yazılır. parent ve child meethodlarında iliski kurar
	//zabıta gıbı ıkı method arasında ıulıskıyı duzenler
public void beslenme() {
	System.out.println("kemık ıle beslenır");
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
