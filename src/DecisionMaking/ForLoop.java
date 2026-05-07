package DecisionMaking;

public class ForLoop {
    static void main(String[] args) {
        /*
        for (initialization;condition;increment/decrement)


        //print 0 to 4
        for (int i = 0; i < 5; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);

        } */
        for (int a = 1; a <= 10; a++) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
        }
    }
}