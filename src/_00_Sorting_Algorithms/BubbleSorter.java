package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
	public BubbleSorter() {
		type = "Bubble";
	}
	
	//1. Use the bubble sorting algorithm to sort the array.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		while(true) {
			boolean changed = false;
			for(int i = 0; i < array.length - 1; i++) {
				if(array[i + 1] < array[i]) {
					int temp = array[i+1];
					array[i+1] = array[i];
					array[i] = temp;
					changed = true;
				}
			}
			display.updateDisplay();
			if(!changed) {
				break;
			}
		}
	}
}
