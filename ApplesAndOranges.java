package com.practice;

import java.util.Scanner;

public class ApplesAndOranges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count1=0;
		int count2=0;
		int res1=0;
		int res2=0;
		int s=sc.nextInt();
		int t=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int m=sc.nextInt();
		int n=sc.nextInt();
		int []apples=new int[m];
		int []oranges=new int[n];
		for(int i=0;i<m;i++)
		{
			apples[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			oranges[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++)
		{
			res1=a+apples[i];
			if(res1>=s && res1<=t)
				count1++;
				
		}
		System.out.println(count1);
		for(int i=0;i<n;i++)
		{
			res2=b+oranges[i];
			if(res2>=s && res2<=t)
				count2++;
				
		}
		System.out.println(count2);
	}

}
