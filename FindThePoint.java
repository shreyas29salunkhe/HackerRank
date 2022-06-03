package com.pract;

import java.util.Scanner;

public class FindThePoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int mx=sc.nextInt();
			int my=sc.nextInt();
			int px=sc.nextInt();
			int py=sc.nextInt();
			int rx=(2*px)-mx;
			int ry=(2*py)-my;
			System.out.println(rx+" "+ry);
		}
		sc.close();
		}
		catch(Exception e)
		{
			
		}

	}

}
