package day41_exception01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exception07 {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4 };

		System.out.println(arr[1]);// 2
		System.out.println(arr[3]);// 4
		System.out.println(arr[5]);// IndexOutOfBoundsException unchecked

		List<String> gzlinsn = new ArrayList<>(Arrays.asList("merve", "hakan", "f�rat"));
		System.out.println(gzlinsn.get(2));
		System.out.println(gzlinsn.get(0));
		System.out.println(gzlinsn.get(5));// ArrayIndexOutOfBoundsException unchecked

		// Array ve Listlerd olmayan b�le �ndec �le �slem yap�l�rsa
		// java �ndexoutofboundexception unchecked atasi verir

	}
}
