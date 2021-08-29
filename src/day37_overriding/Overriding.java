package day37_overriding;
;
	public class Overriding {
	    
	    /*Overriding::::
	     * Parent class'daki bir METHOD'u child class'a gore ozellestirerek kulanmanin adidir.
	     * OVERRIDING KURALLARI
	     * 1) Overriding creat edilirken  "method signature" (name+ parameters)
	     *  kesinlikle ve ASLAAA degistirilemez...!!!   
	     * 
	     * 2)Overriding creat edilirken "access modifier" belirli kurallara gore degistirilebilir
	     * 
	     * 3)Overriding creat edilirken "return type" belirli kurallara gore degistirilebilir
	     * 
	     * 4)Overriding creat edilirken "method body" %99   degistirilir.
	     *    ama degistirilmezse  CTE vermez (amelelik olur overriding amaci body creat etmek .)
	     *  
	     * 5)Overriding creat edilirken "parent - child" relationship sarttir.
	     *    Ahan da trick :  inheritance olamadan overriding olamz  OLAMAZZZZ...!
	     * 
	     * 6)"Overridden method": Parent class'daki methoddur(zavall� ezilen)
	     *   "Overriding method": Child class'daki methoddur( ezen)
	     * 
	     * 7) "Overriding method" (child )'�n AccMo ya "Overridden method" (parent) ile ayni ya da 
	     * daha genis olmali .Evlat babayi erisimini daraltamaz ama genisletebilir. SubAccMod >= SuperAccMod
	     * 
	     * 8)"Overriding method" (child )'�n return type void ise "Overridden method" (parent) return type void olmali 
	     * kendinden olmayani kanul etmez
	     * 
	     * 9)"Overriding method" (child )'�n return type Wrapper clas'dan ise "Overridden method" (parent) return type Wrapper clas'dan
	     *  olmali kendinden olmayani kanul etmez
	     * 
	     * 10- overriding methpd child n return type ile "overridden method" (parent) return aras�nda is-A-child -->�parent relationship iliskisi olmal�
	     * 11- static methodlar overridden edilemezler
	     * 12- private methodlar overriding edilemezler .--> neden; cunku pr�ovate
	     * 13- final methodlar overriding edilemezler--> neden; so hali art�k degistirlemezden de ondan 
	     * 14"Polymorph�sm--interview sorusu---overload�ng ve overriding den olusan yap�ya denir
	     * "overload�ng"--- public void yemek() {......}
	     * 					public void yemek (){ String tatli, }
	     * 					public void yemek (){ String tatli, int �cret }
	     * 
	     * "overridding" --->  public void icmek() {.syso(gazoz).....}
	     * 					public void icmek (){dark ve sek bir kahve }
	     * 					public void icmek (){ syso(�cret). } 
	     * 
	     * overloading ile overriding arasindak� farklar ;
	     * 
	     * 1overloading de method signatures(NAME+PARAMETRE)DEG�ST�R�RL�R. (PARAMETRE DEG�S�R)
	     *  overriding de method signature (name+parametre) asla degistirilemez
	     * 
	     * 2-- "overloading" de inheritance gerekmez
	     *  overriding de inheritance olmadan overriding yap�alamz
	     * 
	     *3- overloading de body genellikle degistirlmeden kullan�l�r
	     * overriing de body hemen hemen her zaman degistirilir
	     * 4- static methodlar overriding edilemezler ama overtloading edilebilirler
	     * privaye methodlar overridng edilemezler ama overloading ediblebilirler
	     * 
	     * 
	     * 5-overloadimg compile time polymorphism dir---static
	     * overriding Run time Polymorphism dir ---dinamik
	     */
	}
