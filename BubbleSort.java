public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {3, 7, -2, 5, 8, 9};
        int n = a.length;
        for (int i = 0; i < n-1; i++)
        {
            boolean sorted = true;
            for (int j = 0; j < n-1-i; j++)
            {
               if (a[j+1] < a[j])
               {
                   int temp = a[j+1];
                   a[j+1] = a[j];
                   a[j] = temp;
                   sorted = false;
               }
            }
            if (sorted) break;
        }
        for (int item:a)
        {
            System.out.print(item +" ");
        }
    }
}