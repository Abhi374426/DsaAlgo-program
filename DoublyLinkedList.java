public class DoublyLinkedList {
    public static void main(String[] args) {
         DLL obj=new DLL();
        obj.insertstart(10);
        obj.insertlast(20);
        obj.insertlast(30);
     obj.insertAfter(obj.search(20),25);
     obj.deleteFirst();
     obj.deleteLast();
     obj.deleteNode(20);
        obj.print();
    }
}
class DLL{
    Node start;

    class Node{
        int item;
        Node prv;
        Node next;


        void setitem(int item){
            this.item=item;
        }
        int getitem(){
            return item;
        }
        void setprv(Node prv){
            this.prv=prv;
        }
        Node  getprv(){
            return prv;
        } 
       void  setnext(Node next){
      this.next=next;
        }
        Node getnext(){
            return next;
        }

    }
   boolean Empty(){
       return start==null;
    }
    void insertstart(int data){
        Node n=new Node();
        n.setitem(data);
        n.setprv(null);
        n.setnext(start);
        start=n;
    }
    void insertlast(int data){
        Node n=new Node();
        n.setitem(data);
        n.setnext(null);
        if (start==null) {
            n.setprv(null);
            start=n;
        }
       
     else{ 
        Node t=start;
       while (t.getnext()!=null){ 
          t=t.getnext();
       }
       n.setprv(t);
       t.setnext(n);

    }
     
    }
    Node search(int data){
        Node t=start;
       while (t!=null) {
          if (t.getitem()==data) {
                return t;
          }
          t=t.getnext();

       }
        return null;
        
    }

    void insertAfter(Node t,int data){
        if(t!=null){
            Node n=new Node();
            n.setitem(data);
            n.setnext(t.getnext());
            n.setprv(t);
            if (t.getnext()!=null) {
                t.getnext().setprv(n);

            }
            t.setnext(n);
        }
    }
    void deleteFirst(){
        if(start!=null){
            if(start.getnext()==null){
                start=null;
            }
            else{
                start.getnext().setprv(null);
                start=start.getnext();
            }
        }
    }
    void deleteLast(){
        if (start!=null) {
            if (start.getnext()==null) {
                start=null;
            }
            else{
               
                Node secondlast=start;
                Node last=start.getnext();
                while(last.getnext()!=null) {
                    last=last.getnext();
                    secondlast=secondlast.getnext();
                }
                secondlast.setnext(null);
            }
        }
    }
    void deleteNode(int data){
        Node n=search(data);

        if (n==null) {
            System.out.println("no such item");
        }
        else{
            if (n==start) {
                deleteFirst();
            }
            else{
                Node temp=n.getprv();
             if(n.getnext()!=null) {
                    n.getnext().setprv(temp);
                }
                temp.setnext(n.getnext());
            }
           
        }
        }
            
    
    void print(){
        Node n=start;
        System.out.println();

         while (n!=null) {
           System.out.println(n.getitem()+" ");
          n=n.getnext();
         }
    }
    
}
