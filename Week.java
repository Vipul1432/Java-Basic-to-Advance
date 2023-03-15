import java.util.*;
public class Week {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Date: ");
        int n = sc.nextInt();
        switch (n) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Date");
        }
    }
}