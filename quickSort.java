public class quickSort {
    public static void main(String[] args) {
        int arr[] = {3, 4, 1, 6, 5, 7};
        
        quickSort(arr, 0, arr.length - 1);
        
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    
     static void quickSort(int[] arr, int lb, int ub) {
        if (lb < ub) {
            int pivot = partition(arr, lb, ub);
            quickSort(arr, lb, pivot - 1);
            quickSort(arr, pivot + 1, ub);
        }
    }
    
    public static int partition(int[] arr, int lb, int ub) {
        int pivot = arr[lb];
        int i = lb;
        int j = ub;
        
        while (i < j) {
          
            while (arr[i] <= pivot) {
                i++;
            }
          
            while ( arr[j] > pivot) {
                j--;
            }
           
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
       
        arr[lb] = arr[j];
        arr[j] = pivot;
        
        return j;
    }
}
