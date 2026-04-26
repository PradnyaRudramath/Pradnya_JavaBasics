package Assignments;

public class Q1_swap {

   public static void main(String[] args) {

        int a=45;
        int b=78;
       System.out.println(a);
       System.out.println(b);

       a=a+b;
       b=a-b;
       a=a-b;
       System.out.printf("Post swapping: ");
       System.out.println(a);
       System.out.println(b);
    }
}
