public class StackUsingLinklist {
    public static void main(String[] args) {
        stacklist s=new stacklist();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek());
        s=stacklist.revStacklist(s);
        System.out.println(s.peek());

    }
}
class stacklist{
    Node  top;

    class Node{
        int item;
        Node next;
      void setitem(int item){
        this.item=item;

      }
      int  getdata()
{
    return item;
}  
void setnext(Node next){
    this.next=next;
}
Node getnext(){
    return next;
}



}
  public void push(int data){
    Node n=new Node();
    n.setitem(data);
    n.setnext(top);
    top=n;
  }
  public int  peek(){
    int x=0;
   try {
    x=top.getdata();
   } catch (Exception e) {
    // TODO: handle exception
    System.out.println("Stack is empty");
   }
return x;
  }

  public int pop()
{
   int  x=0;
    try {
        x=top.getdata();
        top=top.getnext();
    } catch (Exception e) {
        // TODO: handle exception
        System.out.println("Stack is under flow");
    }
    return  x;
}
public boolean isEmpty(){
    return top==null;
}
// public void reverse(){
//    stacklist temp=new stacklist();
//    while (!isEmpty()) {
//          temp.push(pop());
//    }
//    stacklist t=new stacklist();
//    while (!temp.isEmpty()) {
//         t.push(temp.pop());
//    }
//    while (!t.isEmpty()) {
//     push(t.pop());
//    }
// }
  //this is optimize solution solution
  static stacklist revStacklist(stacklist s){
    stacklist temp=new stacklist();
    while (!s.isEmpty()) {
        temp.push(s.pop());
    }
    return temp; 
  }
}
