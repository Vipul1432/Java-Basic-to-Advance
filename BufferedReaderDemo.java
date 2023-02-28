// Java Program to demonstrate BufferedReader

import java.io.BufferReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo
{
     public static void main(String[] args) throws IOException
     {
            //Enter data using BufferReader

            BuffeeredReader reader = new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter Your name : ");
            
            //Reading data using readLine
     String name = reader.readLine();
            
            //Printing the read line 
     System.out.println("Hello " + name);
     }
}