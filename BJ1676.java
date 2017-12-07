package javaBackjoon;

import java.util.Scanner;

public class BJ1676 {
	
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		
		int cnt = reader.nextInt();
		
		while(cnt-- != 0) {
			int rptCnt = reader.nextInt();
			String beforeRepeatStr = reader.next();
			
			printRepeatString(rptCnt, beforeRepeatStr);
		}
		
	}
	
	static void printRepeatString(int repeatCnt, String str) {
		for (char subStr : str.toCharArray()) {
			for(int i = 0; i < repeatCnt; i++) {
				System.out.print(subStr);
			}
		}
		System.out.println();
	}
}
