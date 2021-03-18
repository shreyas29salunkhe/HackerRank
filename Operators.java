package com.practice;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner sc=new Scanner(System.in);
		double mealCost=sc.nextDouble();
		int tipPercent=sc.nextInt();
		int taxPercent=sc.nextInt();
		double tip=(mealCost*tipPercent)/100;
		double tax=(mealCost*taxPercent)/100;
		double totalCost=mealCost+tip+tax;
		System.out.println(Math.round(totalCost));
		sc.close();
		}
		catch(Exception e)
		{
			
		}
	}

}
