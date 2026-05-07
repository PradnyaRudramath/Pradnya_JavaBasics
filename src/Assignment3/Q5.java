package Assignment3;

//prints numbers from 1 to 10 using a for loop.Skip the number 5 using the continue statement.
public class Q5 {
    static void main(String[] args) {
        for (int p = 1; p <= 10; p++) {
            if (p == 5)
            {
                continue;
            }
            System.out.println(p);
        }
    }
}
