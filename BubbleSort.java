public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {2,1,3,4,5};
        Abc a = new Abc();
        a.Abcb(arr);
        
        // Printing sorted array
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

class Abc {
    public void Abcb(int[] arr) {
        int n = arr.length;
        int temp;

        for (int i = 0; i < n - 1; i++) {
            int flag=0;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag++;
                }
            }
            if(flag>=1){
     System.out.println(flag);
                break;
            }
        }
    }
}
