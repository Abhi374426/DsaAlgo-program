public class Recursion {
    public static void main(String[] args) {
        inner s1=new inner();
        // s1.printN(10);
        // s1.printInRevers(3);
       System.out.println( s1.printeven(10));
        // s1.printevenrevers(10);
        // s1.printoddnum(10);
        // s1.printoddnumrev(10);
    }
   
}
class inner{
    public void printN(int n){
        if (n>0) {
            printN(n-1);
            System.out.println(n);
        }
    }
public void printInRevers(int n)
{
    if (n>0) {
        System.out.println(n);
        printInRevers(n-1);
    }
}
public int printeven(int n){
    if (n==0) {
       return 2;

        }
        return n*2+printeven(n-1);
      
    }
}

public void printoddnum(int n){
    if (n>0) {
       printoddnum(n-1);
        if (n%2!=0) {
            System.out.println(n);

        }
        
      
    }
}
public void printoddnumrev(int n){
    if (n>0) {
      
        if (n%2!=0) {
            System.out.println(n);

        }
        printoddnumrev(n-1);

        
      
    }
}


