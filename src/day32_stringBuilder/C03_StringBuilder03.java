package day32_stringBuilder;
import java.util.Arrays;
public class C03_StringBuilder03 {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder();//bos bir sb1 creat ettik. 16 capacty
        //SB e eleman ekleme-->obj.appent(obj);
        sb1.append("faruk");
        System.out.println("sb1 ilk hali : "+sb1);//faruk 
        sb1.append(" efehan");
        System.out.println("sb1 efehan eklenmis hali : "+sb1);//faruk efehan
        System.out.println("sb1 uzunluk :"+sb1.length());//12
        System.out.println("sb1 kapasitesi :"+sb1.capacity());//16
        System.out.println("sb1 son hali :"+sb1.append(" guzel insan"));
        System.out.println("sb1 son hali. kapasite : "+sb1.capacity());
        
        //faruk efehan guzel insan
        //Fazladan ayrýlan kapasiteyi silme -->obj.trimToSize();
        sb1.trimToSize();
        System.out.println(sb1.capacity());//24
        
        
        // istenen charakterin index ini alma -->obj.indexOf();
        System.out.println(sb1.indexOf("e")); //6
        System.out.println(sb1.lastIndexOf("e"));//16
        
        //Ýstenen bir characteri index'ine gore alma --> obj.charAt();      
        System.out.println("sb 7. karakter : "+sb1.charAt(7));//f
        
        
        //belirli bir araliktaki characterleri alma -->obj.subSsequence();
        
        
        
        
        
        System.out.println("sb nýn 7 dahýl 12 harýc karakterlerý"+sb1.subSequence(7, 12));//fehan
        System.out.println("sb nýn 7 dahýl 12 harýc karakterlerý :"+sb1.toString().substring(5));//efehan guzel insan 
        System.out.println("sb nýn 7 dahýl 12 harýc karakterlerý : "+sb1.subSequence(5, sb1.length()));//fehan4
        //sb deký bellý br ýndex ýcýndeký karakteri silme --> obj.delete();  a dahýl b harýc arasý sýler obj.deleteCharAt(a) sadece karakterý sýler
        // 
        sb1.delete(3, 7);
        System.out.println("3-7 arasý karakter silinmis hali : "+sb1);
        sb1.deleteCharAt(2);//sb1.delete(2,3); ----2 karakterý sýler
        System.out.println("2. karakter sýlýnmýs halý :"+sb1);
        System.out.println("faruk efehan son halý"+sb1);//fafehan guzel ýnsan
        
        //ýstenen ýndex ýstene karakterlerý ve karakterýlerý eklemek ---- obj.insert(index,char) ; insert metodu parametre olarak char alm obj alabýlýr
        
        sb1.insert(2, "r");
        System.out.println("2. index e r eklenmýs halý :"+sb1);
        
        sb1.insert(7, 3.14);
        System.out.println(sb1);
        int[]arr= {17,63,21};
        sb1.insert(9,Arrays.toString(arr));//sb1 ýn 9. karakterýnden ýývaren arr verýlerýný ekler
        System.out.println("sb ye arr eklenmýs halý: "+sb1);
        
        //ýstenen ýndex deký caharacterlerýn yerýne býrden fazla character eklemek--> obj.replace(a,b," characters")
        
       StringBuilder sb2=new StringBuilder ("Bugun hava cok sýcak");
       
       System.out.println(sb2);
       sb2.replace(3, 8, "xxxxxxxx");//3 dahýl 8 harýc ýndeler arasýna xxxxxxxxxxxxx caktýk 
      //3 dahil 8 haric indexler arasini silip yerine  xxxxxxxx koyduk.
       
       
       // 3 dahil 8 haric index arasina  verilen  stringi atar, 
       //ama atanacak string kýsa atanacak index uzun olursa  kalan index'teki karakterleri siler
       System.out.println("sb2 son hali :"+sb2);//Bugxxxxxxxxva cook iscakk
       
       System.out.println("ozel durum : "+sb2.insert(5, "basarili", 2, 4));//Bugxxsaxxxxxxva cook iscakk
       /*
        * 5:sb2 ye basarili ekleme baslangic indexi 
        * basarili : eklenecek string
        * 2:eklenecek stringin baslangic indexi--> dahil
        * 4:eklenecek stringin bitis  indexi --> haric.
        */
       //reverse metodu  -->  obj.reverse();   sb elemanlarý indexe gore ters vcevýrý
       StringBuilder sb3=new StringBuilder ("Bugun hava cok sýcak");
System.out.println("sb3 un ýlk halý :"+sb3);
       sb3.reverse();
       System.out.println("sb3 ters cevrýlmýs halý : "+sb3);
        // string ile stringbuilder karsýlastýrmasý 
       //sb de equals metodu strýng classýndan  farklý calýsýr stromg classýndaký ==operatoru ile ayný iþlemi yapar
       //hem içerik hem de refrans karsýlastýrmasý yapar
       String s="hayat";
       StringBuilder sb=new StringBuilder("hayat");//false
       //sb metodu ýle stringe cevýlerek string manupulatýon methodu kullanýlýr
       
       ///System.out.println(s==sb);--farklý daata typelar  karsýlatýrma operatoruderleyemez CTE VERIR
       System.out.println(s.equals(sb));
       System.out.println(s.equals(sb.toString()));//tru string string karsýlaþtýrmasý equals methodu norml calýsýr ýcerýge bakar
       System.out.println(sb.equals(sb.toString()));//sb-string karýlaþtýrmasý equals metodu normal degýl ==gibi calýsýr ...sadece ýcerýge deýl referansada bakar
        System.out.println(s.toString().concat("guzel"));
        System.out.println(sb);
       System.out.println(sb.append(s));//sb ye  sýn 2 ile 5 arasýý append et ekle
        
        
        
        
        
    }}
        
        
