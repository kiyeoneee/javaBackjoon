package javaBackjoon;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hackerRankRichieRich {
    static String richieRich(String s, int n, int k){
        int sLen = n, changeCnt = k;
        int diffCnt = 0;
        char[] result = new char[sLen];
        
        for(int i = 0, j = sLen - 1; i < (sLen / 2); i++, j--) {
            if(s.charAt(i) != s.charAt(j)) diffCnt++;
        }
        
        if(diffCnt > changeCnt)
            return "-1";
        
        for(int i = 0, j = sLen - 1; i < (sLen / 2); i++, j--) {
            if(s.charAt(i) != s.charAt(j)) {
                if(diffCnt == changeCnt) {
                    result[i] = (s.charAt(i) > s.charAt(j) ? s.charAt(i) : s.charAt(j));
                    result[j] = (s.charAt(i) > s.charAt(j) ? s.charAt(i) : s.charAt(j));
                    
                    changeCnt--;
                }
                else {
                    result[i] = '9';
                    result[j] = '9';
                    
                    // if one of char is 9 then just change one thing so changeCnt--
                    if (s.charAt(i) == '9' || s.charAt(j) == '9')
                        changeCnt--;
                    else
                        changeCnt -= 2;
                }
                diffCnt--;
            }
            else if(changeCnt >= 2 && (diffCnt <= changeCnt - 2) && s.charAt(i) != '9') {
        		result[i] = '9';
           		result[j] = '9';
                
                changeCnt -= 2;
            }
            else {
                result[i] = s.charAt(i);
                result[j] = s.charAt(j);
            }
        }
        if(sLen%2  == 1) {
            if(changeCnt > 0) result[sLen/2] = '9';
            else result[sLen/2] = s.charAt(sLen/2);
        }
        
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        String s = in.next();
        String result = richieRich(s, n, k);
        System.out.println(result);
    }
}
