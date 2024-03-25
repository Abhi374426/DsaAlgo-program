/**
 * chack
 */
public class chack {

   public static void main(String[] args) {
      SLL s1=new SLL();
      s1.insertAtStart(10);
      s1.insertAtLast(20);
      s1.insertAtLast(20);
      System.out.println(s1.search(10));
      
      s1.printList();
   }
}

class SLL{
   private Node start;
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
   public boolean isEmpty(){
       return start==null;
   }
   public void insertAtStart(int data){
       Node n=new Node();
       n.setItem(data);
       n.setNext(start);
       start=n;
   }
   public void insertAtLast(int data){
       Node n=new Node();
       n.setItem(data);
       n.setNext(null);
       Node t;

       if(start==null)
           start=n;
       else{
           t=start;
           while(t.getNext()!=null)
               t=t.getNext();
           t.setNext(n);
       }

   }
   public Node search(int data){
       Node t;
       t=start;
       while(t!=null){
           if(t.getItem()==data)
               return t;
           t=t.getNext();
       }
       return null;

   }
   public void insertAfter(Node t,int data){
       if(t!=null){
           Node n=new Node();
           n.setItem(data);
           n.setNext(t.getNext());
           t.setNext(n);
       }

   }
   public void deleteFirst(){
       if(start!=null)
           start=start.getNext();
       else
           System.out.println("List is empty");
   }
   public void deleteLast(){
       if(start==null)
           System.out.println("List is empty");
       else if(start.getNext()==null)
           start=null;
       else{
           Node t;
           t=start;
           while(t.getNext().getNext()!=null)
               t=t.getNext();
           t.setNext(null);
       }
   }
   public void deleteNode(int data){
       Node t=search(data);
       if(t==null)
           System.out.println("No such item found");
       else{
           if(t==start) //first node
               deleteFirst();
           else {
               Node temp;
               temp=start;
               while(temp.getNext()!=t)
                   temp=temp.getNext();
               temp.setNext(t.getNext());
           }
       }
   }
   public void printList(){
       Node t;
       t=start;
       System.out.println();
       while(t!=null){
           System.out.print(t.getItem()+" ");
           t=t.getNext();
       }
      
   }
}
