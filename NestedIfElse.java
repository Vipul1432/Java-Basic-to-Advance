import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();
        if (a > b)
        {
            if (a > c)
            {
                System.out.println("The Greater No is: " +a);
            }
            else
            {
                System.out.println("The Greater No is: " +c);
            }
        }
        else
        {
            if (b > c)
            {
                System.out.println("The Greater No is: " +b);
            }
            else
            {
                System.out.println("The Greater No is: " +c);
            }
        }
    }
}