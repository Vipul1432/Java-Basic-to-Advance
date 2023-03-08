import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No: ");
        int n = sc.nextInt();
        int temp = n;
        int reversedNo = 0;
        while (temp > 0)
        {
            int lastdigit = temp % 10;
            reversedNo = reversedNo * 10 + lastdigit;
            temp /= 10;
        }
        if (reversedNo == n)
        {
            System.out.println(n +" is a Palindrome Number.");
        }
        else
        {
            System.out.println(n + " is Not a Palindrome Number.");
        }
    }
}