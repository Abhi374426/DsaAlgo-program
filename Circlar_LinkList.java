/**
 * Circlar_LinkList
 */
public class Circlar_LinkList {

    public static void main(String args[]){
        CLL obj=new CLL();
        obj.insertFirst(10);
        obj.insertAtLast(20);
       obj.insertAfterNode(obj.search(20), 30);
    //    obj.deleteFirst();
    //    obj.deleteLast();
    // obj.deleteNode(20);
    
        obj.printList();
    }
}
class CLL{

    Node last;
    public class Node{

        int item;
        Node next;

        void setitem(int item){
        this.item=item;
        }
        int getitem(){
            return item;
        }
       void setnext(Node next){
        this.next=next;
       }
       Node getnext(){
        return next;
       }
    }
boolean  Empty(){
    return last==null;

}
void insertFirst(int data){
    Node n=new Node();
    n.setitem(data);
    if (last==null) {
        n.setnext(n);
        last=n;

    }
    else{
        n.setnext(last.getnext());
        last.setnext(n);
    }
}
void insertAtLast(int data){
    Node n=new Node();
    n.setitem(data);
    if (last==null) {
        n.setnext(n);
    

    }
    else{
        n.setnext(last.getnext());
        last.setnext(n);
    }
    last=n;
}
Node search(int data){
    try {
        Node t=new Node();
        t=last.getnext();
       do {
           if (t.getitem()==data) {
               return t;
           } 
           t=t.getnext();
        }while(t!=last.getnext());
        return null;
       

    } catch (Exception e) {
        // TODO: handle exception
        return null;
    }
 
}
void insertAfterNode(Node t,int data){
    if (t!=null) {
        Node n=new Node();
        n.setitem(data);
        n.setnext(t.getnext());
        t.setnext(n);
        if (t==last) {
            last=n;
        }
    }
}
void deleteFirst(){
    if (last!=null) {
        if (last.getnext()==last) {
            last=null;
        }
        else{
            last.setnext(last.getnext().getnext());
        }
    }
}
void deleteLast(){
    if (last!=null) {
        if (last.getnext()==last) {
            last=null;
        }
        else{
            Node temp=new Node();
            temp=last.getnext();
            while (temp.getnext()!=last) {
                temp=temp.getnext();
            }
            temp.setnext(last.getnext());
            last=temp;
        }
    }
}
void  deleteNode(int data)
{
    Node t=search(data);

    if (t!=null) {
        if (last.getnext()==last) {
            last=null;
        }
        else{
            if (t==last) {
               deleteLast(); 
            }
            else{
                Node temp=new Node();
                temp=last.getnext();
                while (temp.getnext()!=t) {
                    temp=temp.getnext();
                }
                temp.setnext(t.getnext());
            }

        }
        
    }
}
void printList(){
    Node t;
    t=last.getnext();
    // System.out.println();
    // while (last.getnext()!=t) {
    //       System.out.println(t.getitem()+" ");
    //       t=t.getnext();
    // }
    do{
        System.out.print(t.getitem()+" ");
        t=t.getnext();
    }while(t!=last.getnext());
    
}
}