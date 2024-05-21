public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={2,3,1,5,4};
        selectin s1=new selectin();
        s1.meth(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
  
}
class selectin{
    public void meth(int []arr){
        int min,temp,i,j;
        for ( i = 0; i < arr.length-1; i++) {
            min=i;
            for( j=i+1;j<arr.length;j++){
                if (arr[j]<arr[min]) {
                    min=j;
                }
            }
            if (min !=i) {
                temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
    }
}
