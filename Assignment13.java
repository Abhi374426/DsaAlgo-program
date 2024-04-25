public class Assignment13 {
    public static void main(String[] args){
       Abc s1 =new Abc();
      
// System.out.println(s1.faboncchiseries21(3));
// s1.decimalTOBinary(10);
// s1.decimalTOOctal(10);
// s1.reversenumber(123);
System.out.println(s1.calulatedsum(4));
        }
}
/**
 * Abc
 */
 class Abc {
  int a=0,b=1,c;  
  
void faboncchiseries(int n){
    // System.out.println(a+" "+b);
        if (n>0) {
          
          
        
            System.out.println(a);
            c=a+b;
            
           a=b;
            b=c;

            faboncchiseries(n-1);
        }
    }
    //another method
    int faboncchiseries21(int n){
        if (n==1||n==0) {
            return n;
       
       
    }
    return faboncchiseries21(n-1)+faboncchiseries21(n-2); 
   
    
}
void decimalTOBinary(int n){
    if (n>0) {
        decimalTOBinary(n/2);
        System.out.println(n%2);
    }

}
void decimalTOOctal(int n){
    if (n>0) {
        decimalTOOctal(n/8);
        System.out.println(n%8);
    }
}
void reversenumber(int n){
    if (n>0) {
        System.out.print(n%10);
        reversenumber(n/10); 
    }
 
}
int calulatedsum(int n){
   
    if (n==1) {
        return 1;
    }
    return n*n+calulatedsum(n-1);
}

 }

