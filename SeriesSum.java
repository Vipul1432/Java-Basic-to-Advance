import java.util.Scanner;
public class SeriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n No : ");
        int n = sc.nextInt();
        float sum = 0;
        for (float i = 1; i <= n; i++)
        {
            sum += 1/i;
        }
        System.out.println("The Sum of n inverse No is : " +sum);
    }
}
