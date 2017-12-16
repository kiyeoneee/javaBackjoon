package javaBackjoon;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hackerRankBigSorting {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }
        // your code goes here
        
        Arrays.sort(unsorted, new Comparator<String> () {
			@Override
			public int compare(String a, String b) {
				if(a.length() != b.length()) {
	                return a.length() - b.length();
	            }
	            
	            else 
	                return a.compareTo(b);
			}
        });
        
        for(int i = 0; i < n; i++) {
        		System.out.println(unsorted[i]);
        }   
    }
}
