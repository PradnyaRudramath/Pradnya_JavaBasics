package OOP.Encaptulation;

public class Obj_BankAccount_const {
    static void main(String[] args) {

        BankAccount_const acc= new BankAccount_const(10000);

        acc.balance=-1000;

        System.out.println(acc.balance);
    }
}
