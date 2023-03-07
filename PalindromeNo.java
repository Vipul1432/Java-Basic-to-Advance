import java.util.Scanner;
public class PalindromeNo {
    public static void main(String[] args) {

        int reverse, sum = 0, temp;
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // It is the number variable to be checked for palindrome
        temp = num;

        while (num > 0) {
            reverse = num % 10; // getting remainder
            sum = (sum * 10) + reverse;
            num = num / 10;
        }
        if (temp == sum)
            System.out.println("Palindrome nuber ");
        else
            System.out.println("Not Palindrome number");
    }
}