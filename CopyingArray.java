public class CopyingArray {
    public static void main(String[] args) {
        int a[] = {1,2,3};
        int b[] =a.clone();
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i] + "");
        }
        for (int i = 0; i < b.length; i++)
        {
            System.out.println(b[i] + "");
        }
    }
    }