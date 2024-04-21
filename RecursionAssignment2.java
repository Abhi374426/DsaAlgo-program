public class RecursionAssignment2 {
   public static void main(String[] args) {
    Abc s1=new Abc();
//    System.out.println( s1.sumNaturalNumb(5));
// System.out.println(s1.sumofoddnumber(3));
// System.out.println(s1.sumofevennumber(3));
// System.out.println(s1.factorail(5));
// System.out.println(s1.sumofdigite(12333));
System.out.println(s1.factorail(3));
   }
}

/**
 * Abc
 */
 class Abc {
  
    int  sumNaturalNumb(int n){
      if (n==1) {
        return 1;
      }
      int sum=n+sumNaturalNumb(n-1);
     return sum;

    }
    int sumofoddnumber(int n){
        if (n==1) {
            
            return 2;
     }
     int sum=2*n+sumofoddnumber(n-1);
       return sum;
}
int sumofevennumber(int n){
    if (n==1) {
        return 1;
    }
    int sum=(2*n-1)+sumofevennumber(n-1);
    return sum;
}
public int factorail(int n){
   if (n==1) {
     return 1;
   }
   return n*factorail(n-1);
}

int sumofdigite(int n){
  
  if (n==0) {
     return 0;
       
  }
   
  return n%10+sumofdigite(n/10);
}
int factorial(int n){
  if (n==0) {
    return 1;
  }
  return n*factorail(n-1);
}

 }
