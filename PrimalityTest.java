package com.pract;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimalityTest {
	static boolean checkPrime(String n)
    {
        // Converting long to BigInteger
        BigInteger b = new BigInteger(String.valueOf(n));
  
        return b.isProbablePrime(1);
    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String l=sc.nextLine();
	       System.out.println(checkPrime(l)?"prime":"not prime");
	       sc.close();
	}

}
