import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Marks of Students: ");
        int n = sc.nextInt();
        System.out.println("Enter tha marks now: ");
        int marks[] = new int[n];
        for (int i = 0; i < n; i++)
        {
            marks[i] = sc.nextInt();
        }
        int avgMarks = 0;
        for (int i = 0; i < n; i++)
        {
            avgMarks += marks[i];
        }
        avgMarks /= n;
        System.out.println("The average marks are :" +avgMarks);
    }
}