
public class QuickSort implements SortingAlgorithm{

	@Override
	public void sort(int[] a) {
		quickSort(a, 0, a.length - 1);
	}
	public void quickSort(int[] a, int low, int high) {
		int i = low;
		int j = high;
		int pivot = a[low+(high-low)/2];
		while (i <= j) {
            while (a[i] < pivot) {
                i++;
            }
            while (a[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(a, i, j);
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (low < j)
            quickSort(a, low, j);
        if (i < high)
            quickSort(a, i, high);
    }
 
    private void exchangeNumbers(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
