
public class MergSort implements SortingAlgorithm{
	@Override
	public void sort(int[] a) {
		mergeSort(a, 0, a.length);
		
	} 
	void mergeSort(int arr[], int low, int high) 
	{ 
	    if (low < high) 
	    { 
	        int mid = low + (high - low)/2; 
	        mergeSort(arr, low, mid); 
	        mergeSort(arr, mid + 1, high); 
	  
	        merge(arr, low, mid, high); 
	    } 
	}
	void merge(int a[], int low, int mid, int high) 
	{ 
	    int i, j, k; 
	    int left = mid - low + 1; 
	    int right =  high - mid; 
	  
	    int leftArray[] = new int[left]; 
	    int rightArray[] = new int[right]; 
	  
	    for (i = 0; i <left ; i++) 
	        leftArray[i] = a[low + i]; 
	    for (j = 0; j < right; j++) 
	        rightArray[j] = a[mid + 1+ j]; 
	  
	    i = 0;
	    j = 0;  
	    k = low; 
	    while (i < left && j < right) { 
	        if (leftArray[i] <= rightArray[j]) 
	        { 
	            a[k] = leftArray[i]; 
	            i++; 
	        } 
	        else
	        { 
	            a[k] = rightArray[j]; 
	            j++; 
	        } 
	        k++; 
	    } 
	  
	    while (i < left) 
	    { 
	        a[k] = leftArray[i]; 
	        i++; 
	        k++; 
	    } 
	  
	    while (j < right) 
	    { 
	        a[k] = rightArray[j]; 
	        j++; 
	        k++; 
	    } 
	} 
	  

}
