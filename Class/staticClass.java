public class staticClass {

    private static String str = "Vipul";

    // nested class which is a Static class
    public static class StaticDemo {
        // non-static method of Static class
        public void show() {
            System.out.println(str);
        }

        // static method of Static class
        public static void diplay() {
            System.out.println("Static method of nested static class");
        }
    }

    public static void main(String args[]) {
        staticClass.StaticDemo obj = new staticClass.StaticDemo();
        obj.show();
        // static method can access with ClassName
        StaticDemo.diplay();
    }
}
