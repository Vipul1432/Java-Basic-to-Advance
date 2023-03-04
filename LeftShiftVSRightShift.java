public class LeftShiftVSRightShift{
      public static void main(String[] agrs){

      //For positive number, >> and >>> works same
      
      System.out.println(20<<2);
      System.out.println(20<2);

       //For negative number, >>> changes patrity bit (MSB) to 0

      System.out.println(-20<<2);
      }
}