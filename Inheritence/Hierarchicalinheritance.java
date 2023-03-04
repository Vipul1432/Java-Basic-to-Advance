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

class Parent2 extends GrandParent {

    void Method() {
        System.out.println("This text is from Parent2 class");
    }
}

public class Hierarchicalinheritance {
    public static void main(String[] args) {
        GrandParent gp = new GrandParent();
        gp.Method();
        Parent p = new Parent();
        p.Method();
        Parent2 p2 = new Parent2();
        p2.Method();
    }

}
