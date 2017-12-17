package javaBackjoon;

import java.util.*;

public class hackerRankSimpleArraySum {

    static int simpleArraySum(int n, int[] ar) {
        // Complete this function
        int result = 0;
        for (int i : ar) 
            result += i;
        
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = simpleArraySum(n, ar);
        System.out.println(result);
    }

}
