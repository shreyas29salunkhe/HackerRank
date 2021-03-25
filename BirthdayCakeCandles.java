package com.practice;

import java.util.Scanner;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner sc = new Scanner(System.in);
		
		int noOfCandles=sc.nextInt();
		int arr[]=new int[noOfCandles];
		
		int max=arr[0];
		for (int i=0;i<noOfCandles;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]>max)
				max=arr[i];
			
		}
		int count=0;
		for (int i=0;i<noOfCandles;i++)
		{
			
			if(arr[i]==max)
				count++;
			
		}
		System.out.println(count);
		sc.close();
		}
		catch(Exception e)
		{
			
		}
		
	}

}
