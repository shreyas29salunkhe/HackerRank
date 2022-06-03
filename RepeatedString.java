package com.pract;

import java.util.Scanner;

public class RepeatedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.next();
		System.out.println("Enter no of repeted string");
		int x=sc.nextInt();
		String str2=str.repeat(x);
		System.out.println(str2);
		/**int count=0;
		for(int j=0;j<str2.length();j++) {
		if(str2.charAt(j)=='a')
		{
			
			count++;
		}
		
		}
		System.out.println(count);**/
		sc.close();
		

	}

}
