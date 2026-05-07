package Assignment3;

//Print numbers from 1 to 50 using a for loop with the following rules:
public class Q6 {
    static void main(String[] args) {
        int totalcount=0;
        for(int i=1;i<=50;i++)
            if(i%3==0 && i%5==0){
                System.out.println(i+" "+ "FizzBuzz");
                totalcount++;
            }else if(i%3==0){
                System.out.println(i+" "+ "Fizz");
            }else if(i%5==0){
                System.out.println(i+" "+ "Buzz");
            }else{
                System.out.println(i);
            }
        System.out.println("Total FizzBuzz count is "+totalcount);
    }
}
