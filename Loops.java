package com.practice;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner sc=new Scanner(System.in);
		int mult=1;
		int n=sc.nextInt();
		for(int i=1;i<11;i++)
		{
			mult=i*n;
			System.out.println(n+" x "+i+" = "+mult);
		}
		sc.close();
		}
		catch(Exception e)
		{
			
		}

	}

}
