package javaBackjoon;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BJ2941 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] croaAlphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		InputStream in = System.in;
		InputStreamReader reader = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(reader);
		
		try {
			System.out.println(countWord(br.readLine(), croaAlphabet));
		} catch (IOException e) {
			
		}
	}
	
	static int countWord(String str, String[] croaAlphabet) {
		int cnt = 0, strLen = str.length();
		
		for(int i = 0; str.length() != 0 && i < 8; i ++) {
			str = str.replace(croaAlphabet[i], " ");
			
			strLen = str.length();
		}

		return str.length();
	}

}
