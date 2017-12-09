package javaBackjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Alphabet {
	private char alphabet;
	private int count;
	
	// 알파벳의 처음 횟수 설정은 0이어야 
	Alphabet() {count = 0;};
	
	public void setAlphabet(char tmpChat) {
		alphabet = tmpChat;
	}
	
	public void addCnt() {
		count += 1;
	}
	
	public int getCnt() {
		return count;
	}
	
	public char getAlphabet() {
		return alphabet;
	}
}

class reverseCmp implements Comparator<Alphabet> {
	public int compare(Alphabet first, Alphabet second) {
		int firstCnt = first.getCnt();
		int secondCnt = second.getCnt();
		
		if(firstCnt > secondCnt) {
			return -1;
		}
		else if (firstCnt < secondCnt) {
			return 1;
		}
		else {
			return 0;
		}
	}
}

public class BJ1156 extends ArrayList<Alphabet> {
	
	static void setAryList(ArrayList<Alphabet> aryAlphabet) {
		for(int i = 0; i < 26; i++) {
			Alphabet tmp = new Alphabet();
			tmp.setAlphabet((char) ('A' + i));
			
			aryAlphabet.add(i, tmp);
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Alphabet> ary = new ArrayList<Alphabet>(26);
		setAryList(ary);
		
		Scanner input = new Scanner(System.in);
		
		String getData = input.nextLine();
		getData = getData.toLowerCase();
		
		for(char tmp : getData.toCharArray()) {
			ary.get(tmp-'a').addCnt();
		}
		
		reverseCmp tmpCmp = new reverseCmp();
		Collections.sort(ary, tmpCmp);
		
		if(ary.get(0).getCnt() == ary.get(1).getCnt()) {
			System.out.println('?');
		}
		else {
			System.out.println(ary.get(0).getAlphabet());
		}
	}

}

