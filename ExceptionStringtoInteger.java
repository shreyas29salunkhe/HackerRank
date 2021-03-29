package com.practice;

import java.util.Scanner;

public class ExceptionStringtoInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
        String S = sc.next();
        try {
            System.out.println(Integer.parseInt(S));
        }
         catch (NumberFormatException ex) {
            System.out.println("Bad String");
        }
        sc.close();
	}

}
