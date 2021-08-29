package day41_exception01;

import java.io.FileInputStream;
import java.io.IOException;

public class Exception04 {
	/*
	 * eger handlke edýlecek exceptionlarda parent chýld exceptýonau varsa paret chýld exceptýoný creat edýlýp 
	 * chýld classs excepsýon olmadan da code calsýýr ancakolumlu durum ; tek catch body ýle tum exceotýonlar handle edýlabýlýr
	 * 
	 * olumsuz durum;  být hata durumunda hata turu vd verýlere ulaþýlamayacagý ýcýn handle edýlme ýmkaný olmaz 
	 */
public static void main(String[] args) {
	 try {
	        FileInputStream file = new FileInputStream(
	                "C:\\Users\\FATMA\\eclipse-workspace\\java2021summerprojecttr\\src\\day41_exception01\\file");
	        file.close();//fis obj close edildi

	        int i = 0;
	        
	        while ((i = file.read()) != -1) {
	            System.out.print((char) (i));
	        }
	    }
	    
	    catch (IOException e) {// I :input O:output dosyalarla ilgili genel yazma ve okuma sorunlari ile handle
	                            // eder
	        // e.printStackTrace();//daha cok kullanilir cunku hatanin tum verisini verir
	        // handle kolayligi saglar
	        System.out.println(e.getMessage());// hata mesajini yazdirir
	    }
	    
	    System.out.println();
	    System.out.println("dewamkeee yazisini okuduysan kod bu satira kadar sorunsuz run olmustur...");
	    }
	
}



