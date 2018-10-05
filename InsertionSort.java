
public class InsertionSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		int temp;
		int j;
		for(int i = 1; i < a.length; i++) {
			j = i;
			while(j-1 >= 0 && a[j] < a[j-1]) {
				temp = a[j];
				a[j] = a[j-1];
				a[j - 1] = temp;
				j--;
			}
		}

	}

}
