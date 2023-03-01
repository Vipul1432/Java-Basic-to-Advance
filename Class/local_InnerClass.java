
public class local_InnerClass {
    private void getValue() {
        int sum = 20;
        // declaring method local inner class
        class InnerClass {
            public int divisor;
            public int remainder;

            // constructor of inner class
            public InnerClass() {
                divisor = 4;
                remainder = sum % divisor;
            }

            private int getDivisor() {
                return divisor;
            }

            private int getRemainder() {
                return sum % divisor;
            }

            private int getQuotient() {
                System.out.println("We are inside the inner class");
                return sum / divisor;
            }
        }
        // creating an instance of inner class
        InnerClass ic = new InnerClass();
        System.out.println("Divisor = " + ic.getDivisor());
        System.out.println("Remainder = " + ic.getRemainder());
        System.out.println("Quotient = " + ic.getQuotient());
    }

    public static void main(String[] args) {
        // creating an instance of outer class
        local_InnerClass oc = new local_InnerClass();
        oc.getValue();
    }
}
