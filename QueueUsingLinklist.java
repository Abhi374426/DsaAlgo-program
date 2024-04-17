
/**
 * QueueUsingLinklist
 * 
 * 
 */
 /**
  * QueueUsingLinklist
  */
 public class QueueUsingLinklist {
 public static void main(String[] args){
    Queue s1=new Queue();
    s1.insert(10);
    s1.insert(20);
    s1.insert(30);
    System.out.println("The Total number of Element"+s1.countItems());
    System.out.println("The front element is"+s1.getFrontItem());
    System.out.println(s1.getRearItem()); 
    s1.delete();
    System.out.println("The Total number of Element"+s1.countItems());
    System.out.println("The front element is"+s1.getFrontItem());
    System.out.println(s1.getRearItem());

 }
    
 }
class Queue {

    Node  front,rear;
    int count;
    /*
     * 
     */
    public class Node {
    
        int  item;
        Node next;
        

        public void setitem(int item){
            this.item=item;
        }
        public int  getitem(){
            return item;
        }
        public void setnext(Node next){
            this.next=next;
        }
        public Node getnext(){
            return next;
        }
       
    }
    public Queue(){
        front=null;
        rear=null;
        count=0;
    }

    public void insert(int data){
        Node n=new Node();

        n.setitem(data);
        n.setnext(n);
        if (rear==null) {
            front=rear=n;
        }
        else{
            rear.setnext(n);
            rear=n;
        }
        count++;
    }
    public int  getRearItem(){
        if (rear==null) {
            throw new ArithmeticException("Empty Queue");
        }
        else{
            return rear.getitem();
        }
    }

   public  int  getFrontItem(){
    if (front==null) {
        throw new ArithmeticException("Empty Queue");
    }
    else{
        return front.getitem();
    }
    
   }
   public void delete(){
    if (front==null) {
        throw new  ArithmeticException("Queue Empty");
    }
    front=front.getnext();
 if (front==rear) {
           front=null;
           rear=null;
    }
    count--;
   }
   public boolean isEmpty(){
    return front==null;
   }
   public int countItems(){
    return count;
   }

}