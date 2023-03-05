public class Abc {
    public static void main(String[] args) {
        static int add(int a,int b)
        {
            return a+b;
        }
        static int add(int a, int b int c)
        {
            return a+b+c;
        }
    }

    class MethodOverloading1 {
        public static void main(String[] args) {
            System.out.println(Abc.add(11, 11));
            System.out.println(Abc.add(11, 11, 11));
        }
    }
}