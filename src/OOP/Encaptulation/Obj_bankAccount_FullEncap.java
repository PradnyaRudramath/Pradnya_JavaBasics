package OOP.Encaptulation;

public class Obj_bankAccount_FullEncap {

    public static void main(String[] args) {

        BankAccount_FullEncap fullEnc=new BankAccount_FullEncap();
        fullEnc.deposite(-50000);

        System.out.println(fullEnc.showBalance());
    }
}
