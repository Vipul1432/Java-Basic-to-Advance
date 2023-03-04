
class Parent {
    protected String str = "Vipul";

    void Method() {
        System.out.println("This text is from Parent class");
    }
}

class Child extends Parent {
    // private String str = "Vipul";

    void Method() {
        super.Method(); // Call Parent Method
        System.out.println("This text is from Child class by : " + str);
    }
}

public class inheritence {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.Method();
        Child ch = new Child();
        // Parent ch = new Child();

        ch.Method();
        System.out.println(ch.str);
    }
}
