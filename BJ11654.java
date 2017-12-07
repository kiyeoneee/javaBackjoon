package javaBackjoon;

import java.util.*;

public class BJ11654 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println(getAsciiCode(reader.next()));
		reader.close();

	}
	
	static int getAsciiCode(String str) {
		return (int) str.toCharArray()[0];
	}

}