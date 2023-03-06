// Java Program to demonstrate the use of nested If Statement.

import java.util.Scanner;
public class Nestedif {
       public static void main(String[] args){
       
       System.out.println("Enter Age : ");
       Scanner sc = new Scanner(System.in);
       int age = sc.nextInt();
 
       System.out.println("Enter weight : ");
       int weight = sc.nextInt();
     
       //Applying condition on age and weight.

       if(age >= 18) {
              if (weight >= 50) {
                      System.out.println("You are eligible to donate blood");
               } else {
                      System.out.println("You are not eligible to donate blood");
                      }
               } else {
                      System.out.println("Age must be greater than 18");
                      }
               }
}