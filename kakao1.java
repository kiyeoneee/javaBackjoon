package javaBackjoon;

import java.util.Scanner;

public class kakao1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int mazeSize = input.nextInt();
		int[] maze1 = new int[mazeSize];
		int[] maze2 = new int[mazeSize];
		
		for(int i = 0; i < mazeSize; i++) {
			maze1[i] = input.nextInt();
 		}
		
		for(int i = 0; i < mazeSize; i++) {
			maze2[i] = input.nextInt();
 		}
		
		for(int i = 0; i < mazeSize; i++) {
			char[] resultWall = new char[mazeSize];
			
			for(int j = mazeSize - 1; j >= 0; j--) {
				resultWall[j] = ((maze1[i] % 2 | maze2[i] % 2) != 0 ? '#' : ' ');
				maze1[i] /= 2;
				maze2[i] /= 2;
			}
			
			for(int j = 0; j < mazeSize; j++) {
				System.out.print(resultWall[j]);
			}
			System.out.println();
		}

	}

}
