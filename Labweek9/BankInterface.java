package Labweek9;

public interface BankInterface {
    void credit(long accountNumber,double amount);

    boolean debit (long accountNumber,double amount);
}

abstract class Bank{
    double amount;
    abstract double getBalance();
}
class BankA extends Bank{
    @Override
    public double getBalance() {
        return amount;
    }
    public void setDeposit(int amount){
        this.amount = amount;
        System.out.println(amount+ " deposit in BankA");
    }
}
class BankB extends Bank{
    @Override
    double getBalance() {
        return amount;
    }
    public void setDeposit(int amount){
        this.amount = amount;
        System.out.println(amount+ " deposit in BankB");
}
    public String toString(){
        return "This is a test";
    }

}

class BankC extends Bank {
    @Override
    double getBalance() {
        return amount;
    }
    public void setDeposit(int amount) {
        this.amount = amount;
        System.out.println(amount+ " deposit in BankC");
    }
}
class Week9{
    public static void main(String[] args) {
        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();
        bankA.setDeposit(100);
        bankB.setDeposit(200);
        bankC.setDeposit(300);

    }
}


