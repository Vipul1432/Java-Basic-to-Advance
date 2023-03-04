class GrandParent {

    void Method() {
        System.out.println("This text is from GrandParent class");
    }
}

class Parent extends GrandParent {

    void Method() {
        System.out.println("This text is from Parent class");
    }
}

class Child extends Parent {

    void Method() {
        // super.Method(); // Call Parent Method
        System.out.println("This text is from Child class");
    }
}

public class multiLevelinheritence {
    public static void main(String[] args) {
        GrandParent gp = new GrandParent();
        gp.Method();
        Parent p = new Parent();
        p.Method();
        Child ch = new Child();
        ch.Method();
    }
}
