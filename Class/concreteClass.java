//Concrete Class  
public class concreteClass {
    // static method of the concreted class
    static int product(int a, int b) {
        return a * b;
    }

    // non static method of the concreted class
    public int sum(int a, int b) {
        return a + b;
    }

    public static void main(String args[]) {
        // method calling
        int p = product(6, 8);
        System.out.println("Product of a and b is: " + p);
        concreteClass obj = new concreteClass();
        System.out.println("Sum of a and b is: " + obj.sum(4, 3));
    }
}