import java.util.Scanner;
    
 // Java Program to demonstrate the use of if statement
public class IfDemo {
       public static void main(String[] args) {
      
       System.out.println("Enter Your age: ");
       Scanner sc = new Scanner(System.in);
       
       int age = sc.nextInt();
       // Checking the age 
      if(age < 18) {
            System.out.println("Sorry... You can't give vote");
            }
      }
} 