package EncapAssignment;

public class Obj_Pin_Encap {

    public static void main(String[] args) {

        Pin_Encap pin_encap = new Pin_Encap();
        int enteredPin=168765;
        if (enteredPin==pin_encap.getPin()){
            System.out.println("PIN Correct, please proceed for transaction");

            pin_encap.depos(-10);
            pin_encap.withdraw(50);
            pin_encap.depos(1000);
            pin_encap.withdraw(500);
            pin_encap.showBalance();
        } else{
            System.out.println("Invalid PIN, Access dined");
        }




    }
}
