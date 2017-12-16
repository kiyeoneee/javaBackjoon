package javaBackjoon;

import java.util.Scanner;

public class hackerRankBomberman {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int row, col, time;
		row = input.nextInt();
		col = input.nextInt();
		time = input.nextInt();
		
		if(time == 1) {
			for(int i = 0; i < row; i++) 
				System.out.println(input.next());
			return;
		}
        
        int[][] map = new int[row + 2][col + 2];
        
        for(int i = 1; i <= row; i++) {
        		String s = input.next();
            for(int j = 1; j <= col; j++) {
                if(s.charAt(j - 1) == '.') map[i][j] = 0;
                else map[i][j] = 1;
            }
        }
        
        if ((time%2) == 0){
            for(int i = 0; i < row; i++) {
                for(int j = 0; j < col; j++)
                    System.out.print("O");
                System.out.println();
            }
            return;
        } 
        
        int[][] plantedMap = new int[row + 2][col + 2];
        for(int i = 1; i <= row; i++) {
            for(int j = 1; j <= col; j++) {
                if(map[i][j] == 1) {
                    plantedMap[i][j] = 1;
                    plantedMap[i-1][j] = 1;
                    plantedMap[i+1][j] = 1;
                    plantedMap[i][j-1] = 1;
                    plantedMap[i][j+1] = 1;
                }
            }
        }
        int[][] plantedMap2 = new int[row + 2][col + 2];
        for(int i = 1; i <= row; i++) {
            for(int j = 1; j <= col; j++) {
                if(plantedMap[i][j] == 0) {
                    plantedMap2[i][j] = 1;
                    plantedMap2[i-1][j] = 1;
                    plantedMap2[i+1][j] = 1;
                    plantedMap2[i][j-1] = 1;
                    plantedMap2[i][j+1] = 1;
                }
            }
        }
        
        if ((time - 3) % 4 == 0) {
            for(int i = 1; i <= row; i++) {
                for(int j = 1; j <= col; j++) {
                    if(plantedMap[i][j] == 1)
                        System.out.print('.');
                    else
                        System.out.print('O');
                }
                System.out.println();
            }
        }
        else if ((time - 1) % 4 == 0) {
            for(int i = 1; i <= row; i++) {
                for(int j = 1; j <= col; j++) {
                    if(plantedMap2[i][j] == 0)
                        System.out.print('O');
                    else
                        System.out.print('.');
                }
                System.out.println();
            }
        } 
    }

}
