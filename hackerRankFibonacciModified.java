package javaBackjoon;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hackerRankFibonacciModified {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner input = new Scanner(System.in);

        int t1 = 0, t2 = 0, idx = 0;
        t1 = input.nextInt();
        t2 = input.nextInt();
        idx = input.nextInt();
        BigInteger result = BigInteger.ZERO;
        
        BigInteger fibbo1 = BigInteger.valueOf(t1);
        BigInteger fibbo2 = BigInteger.valueOf(t2);
        
        for(int i = 2; i < idx; i++) {
            result = fibbo1.add(fibbo2.multiply(fibbo2));
            fibbo1 = fibbo2;
            fibbo2 = result;
        }
        
        System.out.println(result.toString());
    }
}
