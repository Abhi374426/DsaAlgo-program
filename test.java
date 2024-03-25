public class test {
    
        public static void main(String[] args) {
            DynArray arr = new DynArray();
            // arr.append(10);
            // arr.append(20);
            // arr.append(30);
            // arr.append(40);
            // arr.append(50);
            for(int i=0;i<arr.count();i++)
                System.out.print(arr.getValue(i)+"  ");
            System.out.println("Capacity="+arr.getCapacity());
        //     arr.delete(1);
        //     for(int i=0;i<arr.count();i++)
        //         System.out.print(arr.getValue(i)+"  ");
        //     System.out.println("Capacity="+arr.getCapacity());
        // }
    }
        }
     
class DynArray{
    private int lastIndex;
    private int []ptr;
    public DynArray(){
        lastIndex=-1;
        ptr=new int[1];
    }
    public DynArray(int size){
        lastIndex=-1;
        ptr=new int[size];
    }
    void doubleArray(){
        int []temp=new int[ptr.length*2];
        for(int i=0;i<=lastIndex;i++){
            temp[i]=ptr[i];
        }
        ptr=temp;
    }
    void halfArray(){
        int []temp=new int[ptr.length/2];
        for(int i=0;i<=lastIndex;i++){
            temp[i]=ptr[i];
        }
        ptr=temp;
    }
    public void append(int data){
        if(isFull()){
            doubleArray();
        }
        ptr[lastIndex+1]=data;
        lastIndex++;
    }
    public void insert(int index,int data){
        try {
            if (index < 0 || index > lastIndex + 1)
                throw new ArrayIndexOutOfBoundsException("Invalid Index");
            if (isFull()) {
                doubleArray();
            }
            for (int i = lastIndex; i >= index; i--) {
                ptr[i + 1] = ptr[i];
            }
            ptr[index] = data;
            lastIndex++;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
    public void edit(int index,int newData){
        try{
            if (index < 0 || index > lastIndex + 1)
                throw new ArrayIndexOutOfBoundsException("Invalid Index");
            ptr[index]=newData;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
    public void delete(int index){
        try{
            if (index < 0 || index > lastIndex + 1)
                throw new ArrayIndexOutOfBoundsException("Invalid Index");
            for(int i=index;i<lastIndex;i++){
                ptr[i]=ptr[i+1];
            }
            lastIndex--;
            if(ptr.length>1 && lastIndex+1==ptr.length/2)
                halfArray();
        }
        
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
    public int count(){
        return lastIndex+1;
    }
    public boolean isFull(){
        return lastIndex+1==ptr.length;
    }
    public boolean isEmpty(){
        return lastIndex==-1;
    }
    public int getValue(int index){
        try{
            if (index < 0 || index > lastIndex + 1)
                throw new ArrayIndexOutOfBoundsException("Invalid Index");
            return ptr[index];
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        return 0;
    }
    public int getCapacity(){
        return ptr.length;
    }

}