package Assignment3;

//print sum of 1 to 20
public class Q2 {
    static void main(String[] args) {
        int i=1;
        int sum=0;
        while(i<=20){
            sum+=i;
            i++;
        }
        System.out.println("Sum of 1 to 20 is: "+sum);
    }
}
