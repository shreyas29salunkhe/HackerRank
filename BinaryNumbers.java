package com.practice;

import java.util.Scanner;

public class BinaryNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		 Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    int rem=0,s=0,t=0;

		    while(n>0)
		    {
		        rem=n%2;
		        n=n/2;
		        if(rem==1)
		         {   
		           s++;
		           if(s>=t)

		            t=s;
		         }
		         else
		         {
		            s=0;
		         }   
		    }

		    System.out.println(t);
		    sc.close();
		}
		catch(Exception e)
		{
			
		}
	}

}
