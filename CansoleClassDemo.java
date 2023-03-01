// Java program to demonstrate working of System.console()
// Note that this program does not work on IDEs as 
// System.console() may require console
public class ConsoleClassDemo
{
        public static void main(String[] args)
         {
                 System.out.println("Enter your name ");
     
          // Using Console to input data from user 
                  
                  String name = System.console().readLine();
                  System.out.println("Hey " + name);
          }
} 