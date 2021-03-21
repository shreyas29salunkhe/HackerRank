package com.practice;

import java.util.Scanner;

//Calculate the factorial of a number
public class Recursion3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner sc = new Scanner(System.in);
		int testCases=sc.nextInt();		
		while(testCases-->0)
		{
			int num1=sc.nextInt();
			int mult=1;
			for(int i=1;i<=num1;i++)
			{
				mult*=i;
			}
			System.out.println(mult);
			sc.close();
		}
		}
		catch(Exception e)
		{
			
		}
	}

}
