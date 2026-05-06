package OOP.Encaptulation;

public class Obj_BankAccount_Encap {

    static void main(String[] args) {

        BankAccount_Encap accEn= new BankAccount_Encap();
        accEn.setBalance(100);
        System.out.println(accEn.getBalance());
    }
}
