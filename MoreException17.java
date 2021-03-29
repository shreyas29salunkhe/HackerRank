package com.practice;

import java.util.Scanner;

public class MoreException17 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		int n=sc.nextInt();
		int p=sc.nextInt();
		if(n < 0 || p < 0){
	       System.out.println("n and p should be non-negative");
	    }
	    else{
	        int ans= (int)Math.pow(n,p);
	        System.out.println(ans);
	    }
		}
				
		}
		catch(Exception e)
		{
			
		}

	}

}
