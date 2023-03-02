import java.util.Scanner;
public class DivMod {
        public static void main(String[] args){

            System.out.print("Enter Number1 = ");
            Scanner input = new Scanner(System.in);
            int num1 = input.nextInt();
            System.out.println("Enter Number2 = ");
            int num2 = input.nextInt();
            System.out.println("Div " + (num1 / num2));
            System.out.println("Mod " + (num1 % num2));
        }
    }