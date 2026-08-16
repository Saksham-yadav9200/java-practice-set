import java.math.BigInteger;
import java.util.Scanner;
public class FactorialusingRecursion {
    static BigInteger  factorial (int a ){
        if (a==0){
            return BigInteger.ONE ;
        }else{
            return BigInteger.valueOf(a).multiply (factorial(a-1));
        }
    
    }

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

      System.out.println("enter number:");
      int a = sc.nextInt();
      
      System.out.println(factorial(a));
     
     
      sc.close();
        }
}