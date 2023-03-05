import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        if (a >= 1 && a <= 100)
        {
            System.out.println("No is in the Range");
        }
        else
        {
            System.out.println("No is Out of the Range");
        }
    }
}