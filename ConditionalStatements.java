package com.practice;

import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0){
			if(n>2 && n<5 )
			{
				System.out.println("Not Weird");
			}
			else if(n>6 && n<=20)
			{
				System.out.println("Weird");
			}
			else if(n>20)
			{
				System.out.println("Not Weird");
			}
		}
		else if(n%2==1)
			System.out.println("Weird");
		sc.close();
		}
		catch(Exception e)
		{
			
		}

	}

}
