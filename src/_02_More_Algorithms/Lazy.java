package _02_More_Algorithms;

import _00_Sorting_Algorithms.SortingVisualizer;

public class Lazy {

	public static void sort(Double[] array) {
		while(true) {
			boolean changed = false;
			for(int i = 0; i < array.length - 1; i++) {
				if(array[i + 1] < array[i]) {
					double temp = array[i+1];
					array[i+1] = array[i];
					array[i] = temp;
					changed = true;
				}
			}
			if(!changed) {
				break;
			}
		}
	}
	
	public static void sort2(String[] array) {
		while(true) {
			boolean changed = false;
			for(int i = 0; i < array.length - 1; i++) {
				if(array[i + 1].length() < array[i].length()) {
					String temp = array[i+1];
					array[i+1] = array[i];
					array[i] = temp;
					changed = true;
				}
			}
			if(!changed) {
				break;
			}
		}
	}
	public static void sort3(String[] array) {
		while(true) {
			boolean changed = false;
			for(int i = 0; i < array.length - 1; i++) {
				if(array[i + 1].compareToIgnoreCase(array[i]) < 0) {
					String temp = array[i+1];
					array[i+1] = array[i];
					array[i] = temp;
					changed = true;
				}
			}
			if(!changed) {
				break;
			}
		}
	}
}
