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
			System.out.println(value);
		}
		
	}
	
	static void quickSortAry(ArrayList<Integer> ary, int leftIdx, int rightIdx) {
		if(leftIdx < rightIdx) {
			int pivotIdx = quickSortDivide(ary, leftIdx, rightIdx);
			
			if(leftIdx < pivotIdx) quickSortAry(ary, leftIdx, pivotIdx - 1);
			if(pivotIdx + 1 < rightIdx) quickSortAry(ary, pivotIdx + 1, rightIdx);
		}
	}
	
	static int quickSortDivide(ArrayList<Integer> ary, int left, int right) {
		int idxL = left + 1;
		int pivotIdx = left;
		int pivot = ary.get(pivotIdx);
		int tmp;
		
		while(idxL <= right) {
			if(ary.get(idxL) < pivot) {
				pivotIdx++;
				
				tmp = ary.get(idxL);
				ary.set(idxL, ary.get(pivotIdx));
				ary.set(pivotIdx, tmp);
			}
			idxL++;
		}
		
		ary.set(left, ary.get(pivotIdx));
		ary.set(pivotIdx, pivot);
		
		return pivotIdx;
	}
}