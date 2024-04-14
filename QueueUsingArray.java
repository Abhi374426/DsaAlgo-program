public class QueueUsingArray {
  
public static void main(String[] args) {
    inner Q=new inner(5);
    Q.insert(10);
    Q.insert(20);
    Q.insert(30);
    Q.insert(40);
    Q.insert(50);
   
    System.out.println("Total Items: "+Q.countelement());
    System.out.println("Rear Item: "+Q.getrearitem());
    System.out.println("Front Item: "+Q.getFrontitem());
    System.out.println("--------------------------------------------");
    Q.daleted();
    System.out.println("Total Items: "+Q.countelement());
    System.out.println("Rear Item: "+Q.getrearitem());
    System.out.println("Front Item: "+Q.getFrontitem());
    System.out.println("----------------------------------------------");
    Q.insert(60);
    System.out.println("Total Items: "+Q.countelement());
    System.out.println("Rear Item: "+Q.getrearitem());
    System.out.println("Front Item: "+Q.getFrontitem());
    Q.insert(70);
    System.out.println("Total Items: "+Q.countelement());
    System.out.println("Rear Item: "+Q.getrearitem());
    System.out.println("Front Item: "+Q.getFrontitem());
}


}
class inner{
    int front;
    int rear;
    int ptr[];


    inner(int size){
        ptr=new int[size];
        front=-1;
        rear=-1;
    }
    boolean Empty(){
       return front==-1;
    }
    public boolean isfull(){
        return (front==rear+1||front==0&&rear==ptr.length-1);
    }

    void insert(int data){
        if (isfull()) {
             System.out.println("Queue is overflow");
        }
        else if (Empty()) {
            rear=0;
            front=0;
            ptr[rear]=data;
        }
        else if (rear==ptr.length-1) {
            rear=0;
            ptr[rear]=data;
        }
        else{
            rear++;
            ptr[rear]=data;
        }
    }
    public int getrearitem(){
        try{
       return ptr[rear];
        }
        catch(Exception e){
         System.out.println("queue is empty");
        }
        return 0;
    }
    public int getFrontitem(){
        try {
            return ptr[front];
        } catch (Exception e) {
            // TODO: handle exception\
            System.out.println("queue is empty");
        }
        return 0;
    }
    public void daleted(){
        if (Empty()) {
            System.out.println("queue is under flow");
        }
        else if (front==rear) {
            front=-1;
            rear=-1;
        }
        else if (front==ptr.length-1) {
            front=0;
        }
        else  {
            front++;
        }
    }
    public int countelement(){
        if (Empty()) {
            System.out.println("Queue is Empty no element ");
        }
        else if (front<=rear) {
            return rear-front+1;
        }
        else if (rear<=front) {
            return ptr.length-(front-rear)+1;
        }
        return 0;
    }
}
