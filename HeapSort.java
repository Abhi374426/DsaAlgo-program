public class HeapSort {
    
}
class Heap{
    int lastIndex;
    int []ptr;
    public Heap(int size){
        ptr=new int[size];
        lastIndex=-1;
    }
    public boolean  isFull(){
        return lastIndex+1==ptr.length;
    }
    public void insert(int data){
        if (isFull()) {
            int temp[];
            temp=new int[ptr.length*2];
            for(int i=0;i<=ptr.length;i++){
                temp[i]=ptr[i];
                ptr=temp;
            }
            int index,prentindex;
            for (int index = lastIndex+1; index>0; index=prentindex) {
                prentindex=(index-1)/2;
                if (ptr[prentindex]<data) {
                    ptr[index]=ptr[prentindex];

                    
                }
                else{
                    break;
                }

            }
        }
        ptr[index]=data;
        lastIndex++;
    }

    public boolean isEmpty(){
        return lastIndex==-1;
    }
    public int top() throws ArrayIndexOutOfBoundsException
    {
        if (isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("heap is empty")
        }
        return ptr[0];
    }
    public int deleted(){
        int item,leftIndex,rightIndex,temp,index;
        if (isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("heap is empty")
        }
        else{
         item=ptr[0];
         temp=ptr[lastIndex];
         lastIndex--;
         index=0;
         leftIndex=1;
         rightIndex=2;
         while (leftIndex<lastIndex) {
            
         }
        }
    }
}
