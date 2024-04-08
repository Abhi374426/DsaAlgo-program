public class StackUsingArray {
    public static void main(String[] args){
        stack s1=new stack(3);
        s1.push(10);
        s1.push(20);
        s1.push(30);
        System.out.println(s1.peek());
    }
}
class stack{
    private int top;
    private int [] ptr;

    stack(int size){
        ptr=new int[size];
        top=-1;
    }
    public void push(int data){
        try {
            ptr[top+1]=data;
        top++;
        }
         catch (Exception e) {
            // TODO: handle exception
            System.out.println("overflow");
        }
    }
public int peek(){
    int x=0;
    try {
       x=ptr[top];

       
    } catch (Exception e) {
        // TODO: handle exception
        System.out.println("Stack is empty");
    }
   return x;
}
public int pop(){
    int x=0;
    try {
        x=ptr[top];
        top--;
    } catch (Exception e) {
        // TODO: handle exception
        System.out.println("Stack is underflow");
    }
   return x;
}
public void overfolw(){
  try {
    if (top==ptr.length-1) {
        System.out.println("Overflow");
    }
    else{
        System.out.println("underflow");
    }
  } catch (Exception e) {
    // TODO: handle exception
  }
    
}
public boolean isEmpty(){
    return top==-1;
}

}
