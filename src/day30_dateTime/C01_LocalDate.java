package day30_dateTime;

import java.time.LocalDate;

public class C01_LocalDate {

	public static void main(String[] args) {

		
		LocalDate tarih=LocalDate.now();//tarih isminde obj create ettik
		System.out.println("bugunu tarihi :"+tarih);
		
		
		
	System.out.println("bugunden 21 gun sonrasi :"+tarih.plusDays(21));
	System.out.println("bugunden 3 yil  sonrasi :"+tarih.plusYears(3));
	System.out.println("bugunden 3 yil 5 ay 2 yil sonrasi : "+tarih.plusDays(3).plusMonths(5).plusYears(2));
	System.out.println("bugunden 40 gun oncesi : "+tarih.minusDays(40));
	System.out.println("bugunun 5 yil oncesi 2 ay sonrasi 3 hafta öncesi  :"+tarih.minusYears(5).plusMonths(2).plusWeeks(3));
	
	System.out.println(tarih.getDayOfMonth());//2
	System.out.println(tarih.getDayOfWeek());//thursday
	System.out.println(tarih.getMonthValue());//8 agustos ayýný verýr
	System.out.println(tarih.getMonth());// agustos ayýný verýyor
	 LocalDate  dogumGnDate=LocalDate.of(1974, 4, 3);
	System.out.println("dogum tarihi "+dogumGnDate);
	System.out.println("dogum gunu : "+dogumGnDate.getDayOfWeek());
	System.out.println(tarih.isAfter(dogumGnDate));//true
	System.out.println(dogumGnDate.isBefore(tarih));
	
	System.out.println("bugunun artik yil mi :"+tarih.isLeapYear());
	
	
	
	
	
	
	
	
	}

}
