

public class Armstrong{

    public static void main(String[] args) {
      

       
        int num = 156;

       int n = num;
       int r;
        int sum = 0;
        
        while(num>0){

        r = num%10;
        num = num/10;
        sum = sum + r*r*r;

        }
        if (n==sum){
            System.out.println("Number is Armstrong ");
        }
        else{
            System.out.println("is not Armstrong");
        }
    }
    
 

     
    
}
