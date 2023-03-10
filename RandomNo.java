public class RandomNo {
    public static void main(String[] args) {

        // generate random number
        double a = Math.random();
        double b = Math.random();
        // Output is different every tie this code is executed
        System.out.println(a);
        System.out.println(b);

        //Generate random number between 0 to 20
        double e = Math.random() * 20;
        double f = Math.random() * 20;
        // Output is different every time this code is executed
        System.out.println(e);
        System.out.println(f);

        // Generate random nuber between 5 to 30
        double c = 5 + Math.random() * 30;
        double d = 5 + Math.random() * 30;
        // Output is different every time this code is executed
        System.out.println(c);
        System.out.println(d);
    }
    }