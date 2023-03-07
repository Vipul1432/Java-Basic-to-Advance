import java.util.Scanner;
public class Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        int c = (a * a) + (b * b) + 2 * a * b;
        int d = (a + b) * (a + b);
        System.out.println("Square of a and b is: " +c);
        System.out.println("Verify :" +d);
    }
}
