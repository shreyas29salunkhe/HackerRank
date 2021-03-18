package com.practice;

import java.util.Scanner;

public class DataTypes {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int i = 4;
    double d = 4.0;
    String s = "HackerRank ";
    int t=sc.nextInt();
    double f=sc.nextDouble();
    sc.nextLine();
	String str=sc.nextLine();
	System.out.println(i+t);
	System.out.println(f+d);
	System.out.println(s+""+str);
	sc.close();
	}
}
