package day41_exception01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions11 {
public static void main(String[] args) throws IOException {
	
	try {
	FileInputStream fis = new FileInputStream(
            "C:\\Users\\FATMA\\eclipse-workspace\\java2021summerprojecttr\\src\\day41_exception01\\file");
    int i = 0;
    while ((i = fis.read()) != -1) {
        System.out.print((char) (i));

        /*
         * 
         * 
         * throw keywordu sadece declarationd�r
         * 
         * 
         * .throw kullan�lan method except�onda CODE BLOC olur
         * exceptioons aras�nda parent ch�ld �l�sk��s varsa parent class exception throsdan sora yaz�lmal�
         * 
         * 
         */
    }  
    } finally {
    	System.err.println("dewamkeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
    }
}
}
