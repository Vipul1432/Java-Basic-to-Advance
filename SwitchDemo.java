// Java Program to demonstrate the example of switch statement.
// Where we are printing month name for the given number.

import java.util.Scanner;
public class SwitchDemo {
       public static void main(String [] args) {
          // Specifying month number

           System.out.println("Enter month number : ");
           Scanner s = new Scanner(System.in);
           int month = s.nextInt();
           String monthString = "";
      //Switch Statement
 
     Switch(month) {
case 1 : mothString = "1 - January";
break;
case 2 : mothString = "2 - February";
break;
case 3 : mothString = "3 - March";
break;
case 4 : mothString = "4 - April";
break;
case 5 : mothString = "5 - May";
break;
case 6 : mothString = "6 - June";
break;
case 7 : mothString = "7 - July";
break;
case 8 : mothString = "8 - August";
break;
case 9 : mothString = "9 - September";
break;
case 10 : mothString = "10 - October";
break;
case 11 : mothString = "11 - November";
break;
case 12 : mothString = "12 - December";
break;
default : System.out.println("Invalid Month!"0;
          }

     // Printing month of the given number
         
          System.out.println(monthString);
         }
}         
