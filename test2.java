public class test2 {
    public static void main(String[] args){
        abc s1=new abc();
        System.out.println(s1.fibN(3));
    }
}
/**
 * abc
 */
 class abc {
    int fibN(int n){
        if(n==0||n==1)
            return n;
        return fibN(n-1)+fibN(n-2);
    }
    
}
