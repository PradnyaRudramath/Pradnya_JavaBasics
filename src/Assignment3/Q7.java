package Assignment3;

public class Q7 {
    public static void main(String[] args) {
        int actualPin=4521;
        int attempt=1;
        int maxattempt=3;

        while(attempt<maxattempt){
            int enteredPin;
            if(attempt==1){
                enteredPin=1234;
            }else if(attempt==2){
                enteredPin=0000;
            }else{
                enteredPin=4521;
            }
            if(enteredPin==actualPin){
                System.out.println("Access granted");
                break;
            }else{
                int remaining=maxattempt-attempt;
                if(remaining>0){
                    System.out.println("Incorrect PIN. "+remaining+ " attempt(s) remaining");
                }
                else{
                    System.out.println("Card blocked.Contact your bank");
                }

            }
            attempt++;
        }
    }
}
