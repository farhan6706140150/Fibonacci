package fibonacci;


import java.math.BigInteger;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("Masukan Deret angka:");
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
	
		int a = reader.nextInt();
		 BigInteger b = new BigInteger("0");
	     BigInteger c = new BigInteger("1");
		 BigInteger d = new BigInteger("0");
		System.out.println(b);
		System.out.println(c);
		while (a > 0){
			d = b.add(c);
			b = c;
			c = d;
			System.out.println(d);
			a--;
		}
		
	}

}