class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 5;
    }
}

public class nestedClass {
    public static void main(String[] args) {

        OuterClass obj = new OuterClass();
        OuterClass.InnerClass obj2 = obj.new InnerClass();
        System.out.println(obj.x);
        System.out.println(obj2.y);

    }
}
