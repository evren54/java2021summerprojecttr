package day33_encapsulation;

public class C02_InsanMain {
public static void main(String[] args) {
	

	C01_AdemOglu insan1=new C01_AdemOglu();///ademoglundan isan 1 classs create ettık
	//insan1.age=-47;
	insan1.name="onur";
	insan1.surname="enes";
	insan1.setAge(-34);
	//insan1.yasAta(7);
	System.out.println(insan1.name);//onur 
	System.out.println(insan1.surname);//enes
	System.out.println(insan1.getAge());//34
}}
