package day33_accessModifier;

public class C02 {
	public static void main(String[] args) {
		
	
	C01 obj1=new C01();//c01 classýndan obje1 create ettiK
	System.out.println(obj1.defaultAge);
	System.out.println(obj1.protectedAge);
	System.out.println(obj1.publicAge);

	C03 name=new C03();
	System.out.println(name.protectedName);
	System.out.println(name.defaultAge);
	System.out.println(name.publicName);
	}
}










