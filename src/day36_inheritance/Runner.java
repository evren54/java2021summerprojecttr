package day36_inheritance;

public class Runner {
public static void main(String[] args) {
	
	Cat c1=new Cat ();// psiz cons ile obj Data type Cat classýndan 
	/*
	 * ayný isimli variablelar callobj ile call edilirken sonra parentindeki variable call edilir
	 * sonra parentindeki variable call edilir 
	 */
	System.out.println(c1.a);//5 mammal	
	System.out.println(c1.c);//9 kend class c mammaldan degil
	System.out.println(c1.d);//4 mammal
	
	System.out.println(c1.m);
	c1.mM();//animal animal
	c1.mC();//cat Cat classdan calla gitti
	c1.mA();//mammal Mammal class-->call
	 /* Method call edilirken ayný isimli methodlarýn hangisinin alýncagýna const karar verir.
     * childen  parente doðru hiyararsi yapilir.babadan dedeye once kimde bulursa onu alir.
     * Data Type ve Consctructor farkli classlar-->Parent obj =new Child();
     * parent class'dan baslanir child classdan deðil
     * 
     *
     */
    Mammal c2=new Cat(); //c2 obj kendi class'ý mammal
    
	System.out.println(c2.a);//5 Animal class-->call
    System.out.println(c2.c);//7 Mammal class-->call
    System.out.println(c2.m);//4 Mammal class-->call
    
    c2.mA(); //mammal  mammal cons--> call
    c2.mC(); //cat  cat cons-->call
    c2.mM(); // animal mammal  animal cons-->call
    Mammal m1=new Mammal();
    Animal c3=new Cat();
//m1 ve c3 obj uzerinden veriable ve method call???
    
	
}
}
