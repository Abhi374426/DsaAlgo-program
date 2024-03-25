/**
 * DaynamicArray
 */
public class DaynamicArray {

    public static void main(String[] args) {
        InnerDaynamicArray s1=new InnerDaynamicArray();
        s1.append(10);
        // s1.append(20);
        // s1.append(30);
        // s1.append(30);
        // s1.append(40);
        // s1.append(40);
        // s1.append(60);
        // s1.append(70);
        // s1.append(80);
        // s1.append(100);
       for(int i=0;i<s1.count();i++){
        System.out.print(s1.getvalue(i)+" ");
 
       }
       System.out.println("capacity"+s1.getcapacity());
    //    s1.delete(2);
    //    for(int i=0;i<s1.count();i++){
    //     System.out.print(s1.getvalue(i)+" ");

    //    }
    //    System.out.print("capacity"+s1.getcapacity());
    // }
    }}
/**
 * InnerDaynamicArray
 */
class InnerDaynamicArray {

    int lastindex;
    int ptr[];

    public InnerDaynamicArray(){
        lastindex=-1;
        ptr=new int[1];

    }
    public InnerDaynamicArray(int size){
       lastindex=-1;
        ptr=new int[size];
    }
    public void Doublesize(){
        int []ptr1=new int[ptr.length*2];
       for(int i=0;i<=lastindex;i++){
        ptr1[i]=ptr[i];
       }
       ptr=ptr1;
    }
    void halfsize(){
        int ptr1[]=new int[ptr.length/2];
        for(int i=0;i<=lastindex;i++){
            ptr1[i]=ptr[i];
        }
        ptr=ptr1;
    }
    void append(int data){
        if (isfull()) {
            Doublesize();
        }
        ptr[lastindex+1]=data;
        lastindex++;
    }
    public void insert(int index,int data){
        try {
            if (index<0 || index>lastindex+1) {
                throw new ArrayIndexOutOfBoundsException("Invalid index");
            }
            if (isfull()) {
               Doublesize(); 
            }
            for(int i=lastindex;i>=index;i--){
                ptr[i+1]=ptr[i];
            }
            ptr[index]=data;
            lastindex++;
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    public void delete(int index){
        try {
            if (index<0 ||index>lastindex+1) {
                throw new ArrayIndexOutOfBoundsException("Invalid index");
            }
            for(int i=index;i<lastindex;i++){
                ptr[i]=ptr[i+1];

            }
            lastindex--;
            if (ptr.length>1 && lastindex+1==ptr.length/2) {
                halfsize();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    public void edit(int index,int newdata){
        try {
            if (index<0||index>lastindex+1) {
                throw new ArrayIndexOutOfBoundsException("Invalid index");
            }
            ptr[index]=newdata;
        } catch (Exception e) {
            // TODO: handle exception
        }
        
    }
    public boolean isfull(){
     return lastindex+1==ptr.length;
    }
 public int count(){
    return lastindex+1;
 }
 public boolean isEmpty(){
    return lastindex==-1;
 }
 public int getvalue(int index){
    if (index<0 ||index>lastindex+1) {
        throw new ArrayIndexOutOfBoundsException("Invalid index");
    }
    return ptr[index];
 }
 public int getcapacity(){
    return ptr.length;
 }
}