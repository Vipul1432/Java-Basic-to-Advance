public class NestingLoop {
       public static void main(String[] args) {
       
            int i, j;
            for (i = 1; i <= 5; i++) {
                 for(j = 1; j <= 5; j++) 
                    {
                      System.out.println(i);
                    }
                 System.out.println("\n");
                 }
       }
}