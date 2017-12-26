package javaBackjoon;

import java.util.*;

public class hackerRankCountingSort2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] cntNum = new int[100];
        int inputNum = input.nextInt();
      
        for(int i = 0; i < inputNum; i++) {
          cntNum[input.nextInt()]++;
        }
      
        for(int i = 0; i < 100; i++) {
            if(cntNum[i] == 0) 
                continue;
            
            for(int j = 0; j < cntNum[i]; j++) {
                System.out.print(String.format("%d ", i));
            }
        }
     }

}
