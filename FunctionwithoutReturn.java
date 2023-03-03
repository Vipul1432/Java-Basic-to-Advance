import java.util.Scanner;
public class FunctionwithoutReturn {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Points :");
        double points = sc.nextDouble();
        methodRankPoints(points);
    }

    public static void methodRankPoints(double points) {
        if (points >= 90.1) {
            System.out.println("Rank : A1");
        }else if (points >= 80.1) {
            System.out.println("Rank : A2");
        }else {
            System.out.println("Rank : A3");
        }
    }
    }