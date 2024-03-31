/**
 * SingleLinkList1
 */
public class SingleLinkList1 {

   public static void main(String[] args) {
       SingleLinkList s1 = new SingleLinkList();
       s1.insertstart(10);
       s1.insertlast(20);
       s1.insertlast(30);
       s1.printList();
   }
}

class SingleLinkList {

   Node start;

   static class Node {
       int item;
       Node next;

       public  void setitem(int item) {
           this.item = item;
       }

       public int getitem() {
           return item;
       }

       public void setnext(Node next) {
           this.next = next;
       }

       public Node getnext() {
           return next;
       }
   }

   public boolean Empty() {
       return start == null;
   }

   public void insertstart(int data) {
       Node n = new Node();
       n.setitem(data);
       n.setnext(start);
       start = n;
   }

   public void insertlast(int data) {
       Node n = new Node();
       n.setitem(data);
       n.setnext(null);

       if (start == null)
           start = n;
       else {
           Node t = start;
           while (t.getnext() != null)
               t = t.getnext();
           t.setnext(n);
       }
   }

   public void printList() {
       Node t = start;
       System.out.println();
       while (t != null) {
           System.out.print(t.getitem() + " ");
           t = t.getnext();
       }
       System.out.println();
   }
}
