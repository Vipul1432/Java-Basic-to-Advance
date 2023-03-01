final class externalClass {
    String str = "Vipul";
    final static int b = 10;

    public void Method() {
        System.out.println("This is a method inside external class");
    }
}

public class simpleClass {
    private int a = 9;
    public float ft = 7.5f;
    static String str = "Vipul";

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public static void Method() {
        System.out.println("This is a static method before main method");
    }

    public void Method2() {
        System.out.println("This is a non static method before main method");
    }

    class abc {
        public void Method3() {
            System.out.println("This is method3 inside a abc class");
        }
    }

    // private class abcd {
    // public void Method4() {
    // System.out.println("This is method4 inside a private abcd class");
    // }
    // }

    public static void main(String[] args) {
        simpleClass object = new simpleClass();
        System.out.println(object.ft);
        System.out.println(str);
        object.setA(7);
        System.out.println(object.getA());
        System.out.println(object.a);
        Method();
        object.Method2();
        abc object2 = object.new abc();
        object2.Method3();
        // abcd obj = new abcd(); We can't create object of private class
        // object2.Method4(); also can't access methods;
        externalClass obj = new externalClass();
        obj.Method();
        System.out.println(obj.str);
        System.out.println(externalClass.b);

    }
}
