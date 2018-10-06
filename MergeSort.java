
public class MergeSort implements SortingAlgorithm{
	@Override
	public void sort(int[] arr) {
		
		arr = mergeSort(arr);
	}
	public int[] mergeSort(int[] arr) {
		int n = arr.length;
		if (n <= 1) {
			return arr;
		}
		int[] left = new int[n/2];
		int[] right = new int[n - n/2];
		for (int i = 0; i < left.length; i++) {
			left[i] = arr[i];
		}
		for (int i = 0; i < right.length; i++) {
			right[i] = arr[i + n/2];
		}
	        return merge(mergeSort(left), mergeSort(right));
	    }
	
	private static int[] merge(int[] left, int[] right) {
		int[] temp = new int[left.length + right.length];
		int i = 0; 
		int j = 0;
		for (int k = 0; k < temp.length; k++) {
			if(i >= left.length) {
				temp[k] = right[j++];
			}
			else if (j >= right.length) {
				temp[k] = left[i++];
			}
			else if (left[i] <= right[j]) {
				temp[k] = left[i++];
			}	
			else {
				temp[k] = left[j++];
			}
	        }
	        return temp;
	    }
}
