import java.util.Scanner;
   
    //A Java Program to demonstrate the use of if-else statement,
    //It is a program of odd and even number.

public class IfElseDemo {
       public static void main(String[] args) {
       
              System.out.println("Enter Number :");
              Scanner sc = new Scanner (System.in);
              int number = sc.nextInt();

       // Check if the number is divisible by 2 or not 
       if(number % 2 ==0) {
               
              System.out.println("Entered number is even number");
       }else{
              System.out.println("Entered number is odd number");
               }
        }
}