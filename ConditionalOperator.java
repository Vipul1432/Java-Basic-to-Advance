import java.util.Scanner;

public class ConditionalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You Can Vote Now.");
        } else {
            System.out.println("You Can't Vote.");
        }
    }
}