final class A {
    void printmsg() {
        System.out.print("Base class A method is executed.");
    }
}

// non final class
class B {
    void printmsg() {
        System.out.println("Derived class B method is executed.");
    }
}

// derived class
// extending a final class which is not possible
// it shows the error cannot inherit final class at compile time

class C extends B {
    void printmsg() {
        System.out.println("Derived class C method is executed.");
    }
}

// main class
public class finalcClass {
    public static void main(String[] arg) {
        B obj = new B();
        obj.printmsg();
        C obj2 = new C();
        obj2.printmsg();
        A obj3 = new A();
        obj3.printmsg();
    }
}