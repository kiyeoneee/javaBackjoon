package javaBackjoon;

import java.util.Scanner;
import java.util.ArrayList;

public class BJ2750 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> inputAry = new ArrayList<Integer>();
		int size = input.nextInt();
		
		for(int i = 0 ; i < size; i++) {
			inputAry.add(input.nextInt());
		}
		
		quickSortAry(inputAry, 0, inputAry.size() - 1);
		
		for(int value : inputAry) {
			System.out.print(value);
		}
		
	}
	
	static void quickSortAry(ArrayList<Integer> ary, int leftIdx, int rightIdx) {
		int left = leftIdx, right = rightIdx;
		int pivotIdx = (left + right)/2;
		
		while(left < right) {
			int pivot = ary.get(pivotIdx);
			if(ary.get(left) < pivot) {
				left++;
			}
			else {
				while(ary.get(right) > pivot) {
					right--;
				}
				
				int tmp = ary.get(left);
				ary.set(left, ary.get(right));
				ary.set(right, tmp);
				left++;
				right--;
			}
		}
		
		if(left < pivotIdx) {
			quickSortAry(ary, leftIdx, pivotIdx - 1);
		}
		if(right > pivotIdx) {
			quickSortAry(ary, pivotIdx + 1, rightIdx);
		}
	}
}