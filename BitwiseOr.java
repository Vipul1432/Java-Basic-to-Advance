import java.util.Scanner;
public class BitwiseOr {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a: ");
      int a = sc.nextInt();
      System.out.print("Enter b: ");
      int b = sc.nextInt();
      int c = a | b;
        System.out.println("Bitwise of a | b is: " +c);
    }
}