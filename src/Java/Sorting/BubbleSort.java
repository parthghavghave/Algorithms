package Java.Sorting;

public class BubbleSort {

	public int[] bubblesortalgo(int[] list) {

		boolean swapped;

		for (int i = 0; i < list.length; i++) {
			swapped = false;
			for (int j = 0; j < list.length - i - 1; j++) {
				if (list[j] > list[j + 1]) {
					int temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
					swapped = true;
				}
			}
			if (!swapped)
				break;
		}

		return list;

	}

}
