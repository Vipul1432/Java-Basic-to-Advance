
import java.lang.reflect.Constructor;

public class newInstanceConstructorClass {
    String str = "Vipul";

    public static void main(String args[]) {
        try {
            Constructor<newInstanceConstructorClass> obj = newInstanceConstructorClass.class.getDeclaredConstructor();
            newInstanceConstructorClass obj1 = obj.newInstance();
            System.out.println(obj1.str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}