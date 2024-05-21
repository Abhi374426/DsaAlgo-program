public class insertion {
    public static void main(String[] args){
       
        int []arr={3,1,2,6,7,3};
       Innerinsertion s1=new Innerinsertion();
       s1.insert(arr);

       for (int i : arr) {
         System.out.print(i+" ");
       }

    }
}
/**
 * Innerinsertion
 */
class Innerinsertion {
    public void insert(int arr[]){
        int temp,j;
        for (int i = 1; i < arr.length; i++) {
            temp=arr[i];
            j=i-1;

            while (j>=0&&arr[j]>temp) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
    
}