package DecisionMaking;

public class SwitchStatement {
    public static void main(String[] args) {
        int num = 7;
        String size="";

        switch (num) {
            case 2: size= "Small";
            break;

            case 5: size= "Medium";
            break;

            case 7: size= "Large";
            break;

            case 10: size = "Extra large";
            break;

            default:
                System.out.println("Invalid number");;
        }
        System.out.println(size);
    }
}
