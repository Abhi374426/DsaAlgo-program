public class CircularDoublyLinkList {
    public static void main(String[] arrs){
      CDLL s1=new CDLL();
       s1.insertFirst(10);
       s1.insertAtLast(20);
       s1.insertAfter(s1.search(20), 30);
    //    s1.deleteFirst();
    s1.deleteLast();
    s1.delete(20);
       s1.print();
     

       
    }
}
class CDLL{
    Node start;
  public  class Node{
        int item;
        Node next;
        Node prv;

   public  void setitem(int data){
            this.item=data;
        }
       public int  getitem(){
            return item;

        }
     public   void  setnext(Node next){
            this.next=next;

        }
      public  Node  getnext(){
            return next;
        }
       public void setprv(Node prv){
            this.prv=prv;
        }
      public  Node getprv(){
            return prv;
        }
    }

    boolean empty(){
        return start==null;
    }

    void insertFirst(int data){
       Node n=new Node();
       n.setitem(data);
        if (start==null) {
            n.setnext(n);
            n.setprv(n);
            start=n;
        }
        else{
            n.setnext(start);
            n.setprv(start.getprv());
            start.getprv().setnext(n);
            start.setprv(n);
            start=n;
        }
        
    }
    void insertAtLast(int data){
        Node n=new Node();
        n.setitem(data);
        if (start==null) {
            n.setnext(n);
            n.setprv(n);
            start=n;
        }
        else{
            n.setnext(start);
            n.setprv(start.getprv());
           start.getprv().setnext(n);
            start.setprv(n);
            
        }

    }
    Node search(int data){
        Node t;
        t=start;
        if (t==null) {
           return null;
        }
        do{
            if (t.getitem()==data) {
                return t;
            }
            t=t.getnext();
        }while(t!=start);
        return null;
    }
    void insertAfter(Node t,int data){
       if (t!=null) {
        Node n=new Node();
        n.setitem(data);
        n.setnext(t.getnext());
        n.setprv(t);
        t.getnext().setprv(n);
        t.setnext(n);
       }
      

    }
    void deleteFirst(){
        if (start!=null) {
            if (start.getnext()==start) {
                start=null;
            }
            else{
                start.getnext().setprv(start.getprv());
                start.getprv().setnext(start.getnext());
                start=start.getnext();
            }
        }
    }
    void deleteLast(){
        if (start!=null) {
            if (start.getnext()==start) {
                start=null;
            }
            else{
                start.getprv().getprv().setnext(start);
                start.setprv(start.getprv().getprv());
            }
        }
       
    }
     void delete(int data){
        Node t=search(data);

        if (t!=null) {
            if (start==t) {
                deleteFirst();
            }
            else if(start.getprv()==t){
               deleteLast();
            }
            else{
               
                t.getnext().setprv(t.getprv());
                t.getprv().setnext(t.getnext());
            }
        }
       
     }
 void print(){
        Node t;
        t=start;
        if (t!=null) {
            do{
                System.out.println(t.getitem()+" ");
                t=t.getnext();
            }while(t!=start);
        }
    }
}
