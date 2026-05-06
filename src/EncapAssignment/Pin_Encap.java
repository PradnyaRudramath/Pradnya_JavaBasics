package EncapAssignment;

public class Pin_Encap {

    private double balanc;
    private int pin=123456;


    public void depos(double amount) {
        if (amount >= 0) {
            balanc += amount;
            System.out.println("Deposited amount " + amount);
        }else{
            System.out.println("Invalid amount");

            }
            }

            public void withdraw(double amount) {
        if (amount >= 0 && amount <= balanc) {
            balanc -= amount;
            System.out.println("Withdrawn " + amount);
        }else{
            System.out.println("Invalid amount or Insufficient Balance");
        }

    }
public void showBalance(){
        System.out.println("Available Balance: "+balanc);
}

   /* public double getAmount() {
        return balanc;
    }

    public void setAmount(double amount) {
        if (amount >= 0) {
            this.balanc = amount;
        }
    }
*/
        public int getPin () {
            return pin;
        }

        public void setPin ( int pin){
            //if (pin != 123456) {
            //    System.out.println("Invalid PIN");
           // } else {

            this.pin = pin;
            }
        }






