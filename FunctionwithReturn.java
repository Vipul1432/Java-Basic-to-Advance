import java.util.Scanner;
public class FunctionwithReturn {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a :");
        int a = sc.nextInt();

        System.out.println("Enter b :");
        int b = sc.nextInt();

        int c = minFunction(a, b); // method call or method
        System.out.println("Minimum Value = " + c);
        }
        // Returns the minimum of two number
    public static int minFunction(int n1, int n2) {
        int min;
        if (n1 > n2)
            min = n2;
        else
            min = n1;
        return min;
    }
    }