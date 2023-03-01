import java.util.Scanner;
public class ConditionalExpr {
       public static void main(String[] args) {
    
       String out;
       System.out.println("Enter value of a : ");
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
   
       out = a == b ? "Yes" : "No";
       System.out.println("Ans : " +out);
       }
}