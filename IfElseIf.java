import java.util.Scanner;
public class IfElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        if (a <= 10)
        {
            System.out.println("The No is Less than 10.");
        }
        else if(a > 10 && a <= 20)
        {
            System.out.println("The No is Greater than 10 less than 20.");
        }
        else if(a > 20 && a <= 30)
        {
            System.out.println("The No is Greater than 20 less than 30.");
        }
        else
        {
            System.out.println("The No is Greater than 30.");
        }
    }
}