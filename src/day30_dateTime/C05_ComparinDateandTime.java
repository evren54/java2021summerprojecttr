package day30_dateTime;

import java.time.LocalDate;

public class C05_ComparinDateandTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
///�k� tar�r�g aras�ndak� fark 
		
		LocalDate bugun=LocalDate.now();
        LocalDate date=LocalDate.of(2021, 8, 15);
        int fark=bugun.compareTo(date);
        System.out.println(bugun);
        System.out.println(date);
        System.out.println(fark);//1
        //kars�last�r�lan �k� tar�h�n en buyuk parvas�n� ver�r
        
        
	}

}
