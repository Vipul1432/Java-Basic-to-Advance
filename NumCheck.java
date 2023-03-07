import java.util.Scanner;
public class NumCheck {
       public static void main(String[] args){
    
       System.out.print("Enter Number = ");
       Scanner input = new Scanner(System.in);
       int num = input.nextInt();
       if(num < 0)
       {
               System.out.println("Enter number is negative");
         }
       else 
         {
               System.out.println("Enter number is positive");
       }
    }
}