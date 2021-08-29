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
        //Fazladan ayr�lan kapasiteyi silme -->obj.trimToSize();
        sb1.trimToSize();
        System.out.println(sb1.capacity());//24
        
        
        // istenen charakterin index ini alma -->obj.indexOf();
        System.out.println(sb1.indexOf("e")); //6
        System.out.println(sb1.lastIndexOf("e"));//16
        
        //�stenen bir characteri index'ine gore alma --> obj.charAt();      
        System.out.println("sb 7. karakter : "+sb1.charAt(7));//f
        
        
        //belirli bir araliktaki characterleri alma -->obj.subSsequence();
        
        
        
        
        
        System.out.println("sb n�n 7 dah�l 12 har�c karakterler�"+sb1.subSequence(7, 12));//fehan
        System.out.println("sb n�n 7 dah�l 12 har�c karakterler� :"+sb1.toString().substring(5));//efehan guzel insan 
        System.out.println("sb n�n 7 dah�l 12 har�c karakterler� : "+sb1.subSequence(5, sb1.length()));//fehan4
        //sb dek� bell� br �ndex �c�ndek� karakteri silme --> obj.delete();  a dah�l b har�c aras� s�ler obj.deleteCharAt(a) sadece karakter� s�ler
        // 
        sb1.delete(3, 7);
        System.out.println("3-7 aras� karakter silinmis hali : "+sb1);
        sb1.deleteCharAt(2);//sb1.delete(2,3); ----2 karakter� s�ler
        System.out.println("2. karakter s�l�nm�s hal� :"+sb1);
        System.out.println("faruk efehan son hal�"+sb1);//fafehan guzel �nsan
        
        //�stenen �ndex �stene karakterler� ve karakter�ler� eklemek ---- obj.insert(index,char) ; insert metodu parametre olarak char alm obj alab�l�r
        
        sb1.insert(2, "r");
        System.out.println("2. index e r eklenm�s hal� :"+sb1);
        
        sb1.insert(7, 3.14);
        System.out.println(sb1);
        int[]arr= {17,63,21};
        sb1.insert(9,Arrays.toString(arr));//sb1 �n 9. karakter�nden ��varen arr ver�ler�n� ekler
        System.out.println("sb ye arr eklenm�s hal�: "+sb1);
        
        //�stenen �ndex dek� caharacterler�n yer�ne b�rden fazla character eklemek--> obj.replace(a,b," characters")
        
       StringBuilder sb2=new StringBuilder ("Bugun hava cok s�cak");
       
       System.out.println(sb2);
       sb2.replace(3, 8, "xxxxxxxx");//3 dah�l 8 har�c �ndeler aras�na xxxxxxxxxxxxx cakt�k 
      //3 dahil 8 haric indexler arasini silip yerine  xxxxxxxx koyduk.
       
       
       // 3 dahil 8 haric index arasina  verilen  stringi atar, 
       //ama atanacak string k�sa atanacak index uzun olursa  kalan index'teki karakterleri siler
       System.out.println("sb2 son hali :"+sb2);//Bugxxxxxxxxva cook iscakk
       
       System.out.println("ozel durum : "+sb2.insert(5, "basarili", 2, 4));//Bugxxsaxxxxxxva cook iscakk
       /*
        * 5:sb2 ye basarili ekleme baslangic indexi 
        * basarili : eklenecek string
        * 2:eklenecek stringin baslangic indexi--> dahil
        * 4:eklenecek stringin bitis  indexi --> haric.
        */
       //reverse metodu  -->  obj.reverse();   sb elemanlar� indexe gore ters vcev�r�
       StringBuilder sb3=new StringBuilder ("Bugun hava cok s�cak");
System.out.println("sb3 un �lk hal� :"+sb3);
       sb3.reverse();
       System.out.println("sb3 ters cevr�lm�s hal� : "+sb3);
        // string ile stringbuilder kars�last�rmas� 
       //sb de equals metodu str�ng class�ndan  farkl� cal�s�r stromg class�ndak� ==operatoru ile ayn� i�lemi yapar
       //hem i�erik hem de refrans kars�last�rmas� yapar
       String s="hayat";
       StringBuilder sb=new StringBuilder("hayat");//false
       //sb metodu �le stringe cev�lerek string manupulat�on methodu kullan�l�r
       
       ///System.out.println(s==sb);--farkl� daata typelar  kars�lat�rma operatoruderleyemez CTE VERIR
       System.out.println(s.equals(sb));
       System.out.println(s.equals(sb.toString()));//tru string string kars�la�t�rmas� equals methodu norml cal�s�r �cer�ge bakar
       System.out.println(sb.equals(sb.toString()));//sb-string kar�la�t�rmas� equals metodu normal deg�l ==gibi cal�s�r ...sadece �cer�ge de�l referansada bakar
        System.out.println(s.toString().concat("guzel"));
        System.out.println(sb);
       System.out.println(sb.append(s));//sb ye  s�n 2 ile 5 aras�� append et ekle
        
        
        
        
        
    }}
        
        
