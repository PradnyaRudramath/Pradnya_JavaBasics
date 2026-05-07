package Assignment3;

//print 1 to 10 with even or odd
public class Q1 {
    String size = "";

    public static void main(String[] args) {
        for (int n = 1; n <= 10; n++) {

            /*
            String size = (n % 2 == 0) ? "Even" : "Odd";{
                System.out.println(n+ "--> " + size);
            }
                     */

            if(n%2==0){
                System.out.println(n + "-->Even");
            }else{
                System.out.println(n + "-->Odd");
            }
        }

        }
    }

