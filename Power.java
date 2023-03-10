import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no a: ");
        int a = sc.nextInt();
        System.out.println("Enter no b: ");
        int b = sc.nextInt();
        int power = 1;
        for (int i = 0; i < b; i++)
        {
           power *= a;
        }
        System.out.println(power);
    }
}