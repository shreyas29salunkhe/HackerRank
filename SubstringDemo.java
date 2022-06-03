package com.pract;


import java.util.*;

public class SubstringDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    String str=sc.next();
	    int k=sc.nextInt();
	    SortedSet<String> sets=new TreeSet<String>();
	    for(int i=0;i<=str.length()-k;i++){
	        sets.add(str.substring(i,i+k));
	       
	    }
	    //System.out.println(sets);
	    System.out.println(sets.first()+"\n"+sets.last());
	    sc.close();
	    

	}

}
