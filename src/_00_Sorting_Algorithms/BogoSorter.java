package _00_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}
	
	// Bogo sort is a joke sorting algorithm. It is considered the most 
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.
	
	// It works by following these steps:
	// STEP 1. Is the array in order?
	//	if yes, finished; if no, go to step 2.
	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.
	
	//1. Complete the sort method using the Bogo sort algorithm. 
	@Override
	void sort(int[] array, SortingVisualizer display) {
		areDone(array, display);
	}
	
	void areDone(int[] array, SortingVisualizer display) {
		boolean sorted = true;
		for(int i = 1; i < array.length; i++) {
			if(array[i] < array[i - 1]) {
				sorted = false;
			}
		}
		if(!sorted) {
			Random random = new Random();
			int spot1 = random.nextInt(array.length);
			int spot2;
			do {
				spot2 = random.nextInt(array.length);
			} while(spot2 == spot1);
			int temp = array[spot1];
			array[spot1] = array[spot2];
			array[spot2] = temp;
			display.updateDisplay();
			areDone(array, display);
		}
		else {
			display.updateDisplay();
		}
	}
}
