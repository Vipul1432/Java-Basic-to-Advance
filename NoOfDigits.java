import java.util.Scanner;

public class NoOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No: ");
        int n = sc.nextInt();
        int noOfDigits = (int) Math.log10(n) + 1;
        System.out.println("You Enter the no of digits is: " +noOfDigits);
    }
}