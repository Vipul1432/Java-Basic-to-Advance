import java.util.Collection;

public class newInstanceMethod {

  String str = "Vipul";

  public static void main(String args[]) {
    try {
      // creating object of class

      Class cls = Class.forName("newInstanceMethod");
      newInstanceMethod obj = (newInstanceMethod) cls.newInstance();

      // newInstanceMethod obj = newInstanceMethod.class.newInstance();

      /*
       * newInstanceMethod obj =
       * (newInstanceMethod)Class.forName("newInstanceMethod").newInstance();
       */

      System.out.println(obj.str);
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}
