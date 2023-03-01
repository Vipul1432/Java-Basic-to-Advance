
interface Score {
    int run = 321;

    void getScore();
}

public class anonymous_InnerClass {
    public static void main(String[] args) {
        // Myclass is hidden inner class of Score interface
        // whose name is not written but an object to it is created.
        Score s = new Score()
        // Anonymous InnerClass
        {
            @Override
            public void getScore() {
                // prints score
                System.out.print("Score is " + run);
            }
        };
        s.getScore();
    }
}