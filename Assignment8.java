

public class Assignment8 {
    public static void main(String[] args){
        StackList s=new StackList();
        s.push(10);
        s.push(20);
        s.push(30);
        s.pop();
        System.out.println(s.peek());
       
    }
}
class StackList{
    private Node top;
    public class Node{
        private int item;
        private Node next;

        public int getItem() {
            return item;
        }

        public void setItem(int item) {
            this.item = item;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
    public void push(int data){
        Node n=new Node();
        n.setItem(data);
        n.setNext(top);
        top=n;
    }
    public int peek(){

        int x=0;
        try{
            x=top.getItem();
        }
        catch(NullPointerException e){
            System.out.println("Stack is Empty");
        }
        return x;
    }
    public int pop(){

        int x=0;
        try{
            x=top.getItem();
            top=top.getNext();
        }
        catch(NullPointerException e){
            System.out.println("Stack Underflow");
        }
        return x;
    }
    public boolean isEmpty(){
        return top==null;
    }
    public void reverse(){
        StackList temp=new StackList();
        while(!isEmpty()){
            temp.push(pop());
        }

        StackList t=new StackList();
        while(!temp.isEmpty()){
            t.push(temp.pop());
        }

        while(!t.isEmpty()){
            push(t.pop());
        }
    }
    public static StackList reverseStack(StackList s){
        StackList temp=new StackList();
        while(!s.isEmpty()){
            temp.push(s.pop());
        }
        return temp;
    }
}







