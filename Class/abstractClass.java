
//abstract class  
abstract class MathematicalOperations {
    int a = 30, b = 40;

    // abstract method has no body
    public abstract void add();
}

public class abstractClass extends MathematicalOperations {
    // definition of abstract method overriding
    public void add() {
        System.out.println("Sum of a and b is: " + (a + b));
    }

    public static void main(String args[]) {
        MathematicalOperations obj = new abstractClass();
        obj.add();
    }
}
