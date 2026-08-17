import java.util.Scanner;
public class practiseset {
    static int factorial(int n){
        if (n==0){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
           System.out.println("enter number:");
           int num = sc.nextInt(); 
           System.out.println(factorial(num));
           

           sc.close();
        }
        
    
}
