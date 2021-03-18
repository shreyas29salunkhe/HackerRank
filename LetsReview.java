package com.practice;

import java.util.Scanner;

public class LetsReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			sc.nextLine();
			String str=sc.next();
			for(int i=0;i<str.length();i++)
			{
				if(i%2==0) {
					System.out.print(str.charAt(i));
				}
				
				
			}
			System.out.print(" ");
			for(int i=0;i<str.length();i++)
				{
					if(i%2==1) {
						System.out.print(str.charAt(i));
				}
				
				
				}
			System.out.println();
			}
			sc.close();
	}
	catch(Exception e)
	{
		
	}
	}

}
