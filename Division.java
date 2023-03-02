import java.util.Scanner;
public class Division{
       public static void main(String[] args) {
 
       System.out.println("Enter Number1 = ");
       Scanner input = new Scanner(System.in);
       int num1 = input.nextInt();
       System.out.println("Enter Number2 = ");
       int num2 = input.nextInt();
       if(num2 != 0)
       
       System.out.println("Division = " + (num1/num2));

    else
       
       System.out.println("Enter non zero value for num2");       
       }
}