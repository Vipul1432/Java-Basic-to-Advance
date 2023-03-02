// Take Start and End Range from user ... Print all No divisible by 5
import java.util.Scanner;
public class Abc {
    public static void main(String[] args) {
        int start, end;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a starting Number: ");
        start = scan.nextInt();
        System.out.print("Enter an ending Number: ");
        end = scan.nextInt();

        System.out.println("All numbers divisible by two in this range are: ");
        for (start = start; start <= end; start++) {
            if (start % 5 == 0) {
                System.out.print(start + "\n");
            }
        }
    }
}