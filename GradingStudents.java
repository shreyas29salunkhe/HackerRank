package com.practice;

import java.util.Scanner;

public class GradingStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner sc = new Scanner(System.in);
		int testCases=sc.nextInt();
		while(testCases-->0)
		{
			int grade=sc.nextInt();
			System.out.println(grade < 38 || grade % 5 < 3 ? grade : grade + (5 - (grade % 5)));
		
		}
		sc.close();
		}
		catch(Exception e)
		{
			
		}
	}

}
