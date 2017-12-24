package javaBackjoon;

import java.util.Scanner;

public class HackerRankCamelClass {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String str = input.next();
		int wordCnt = 1;
		
		for(char s: str.toCharArray()) {
			if(s >= 'A' && s <= 'Z')
				wordCnt++;
		}
		
		System.out.println(wordCnt);
	}
	
}
