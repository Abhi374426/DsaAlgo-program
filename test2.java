public class test2 {
    public static void main(String[] args) {
        SingleLinkList s1=new SingleLinkList();
        s1.insertstart(10);
        s1.insertlast(20);
        s1.insertlast(30);
        s1.insertlast(40);
        // s1.deletelast();
        s1.deleteDataNode(30);
     s1.insertAfter(s1.search(30), 35);

        
        s1.printList();

    }
}
class SingleLinkList {
 
    Node start;
    
    class Node{
       int item;
       Node next;
 
       void setitem(int item){
          this.item=item;
          
       }
    void  setnext(Node next){
          this.next=next;
       }
 
        Node getnext(){
          return next;
         }
         int getitem(){
          return item;
         }
       }
         public boolean Empty(){
          return start==null;
         }
         public void insertstart(int data){
          Node n=new Node();
          n.setitem(data);
        n.setnext(start);
          start=n;
         }
         public void insertlast(int data){
           
                Node n=new Node();
                n.setitem(data);
                n.setnext(null);
                if (start==null) {
                    start=n;
                } else {
                    Node t = start;
                    while (t.getnext()!=null) {
                        t=t.getnext();
                    }
                    t.setnext(n);
                }
            }
            
         
         public Node search(int data){
          Node t;
          t=start;
         while (t!=null) {
             if (t.getitem()==data) {
                return t;
             }
             t=t.getnext();
         }
         return null;
     
         }
         public void insertAfter(Node t,int data){
          if (t!=null) {
             Node n=new Node();
             n.setitem(data);
             n.setnext(t.getnext());
             t.setnext(n);
          }
         }
         public void deleteFirst(){
          if (start==null) {
             System.out.println("List is Empty");
          }else{
          start=start.getnext();
          }
         }
         public void deletelast(){
          if (start==null) {
             System.out.println("list Empty");
             return;
          }
        else  if (start.getnext()==null) {
             start=null;
            
          }else{
          Node secondlast=start;
          Node last=start.getnext();
 
          while (last.getnext()!=null) {
             last=last.getnext();
             secondlast=secondlast.getnext();
 
             
          }
          secondlast.setnext(null);
       }
         }
         public void deleteDataNode(int data){
          Node t=search(data);
            if (t==null) {
             System.out.println("the data node is node found");
            }
            else{
            if (t==start) {
              deleteFirst();
            }
            else{
             Node temp=start;
             while (temp.getnext()!=t) {
                 temp=temp.getnext();
             }
             temp.setnext(t.getnext());
            }
          }
      }
      
 
    
    public void printList(){
       Node t;
       t=start;
       System.out.println();
       while(t!=null){
           System.out.print(t.getitem()+" ");
           t=t.getnext();
       }
      
   }
 }
