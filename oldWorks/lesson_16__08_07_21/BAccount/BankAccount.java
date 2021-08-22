package lesson_16__08_07_21.BAccount;


// поля класса имеют дефолт
// локальные переменные нет

public class BankAccount {
    private long account;
    private String bank;
    private int branch;
    private String owner;
    private double balance = 10;

    public BankAccount(long account, String bank, int branch, String owner, double balance) {
        this.account = account;
        this.bank = bank;
        this.branch = branch;
        this.owner = owner;
        this.balance = balance;
    }

    public BankAccount(long account, String bank, int branch, String owner) {
        this.account = account;
        this.bank = bank;
        this.branch = branch;
        this.owner = owner;
    }

    public BankAccount(long account, String bank, int branch, double balance) {
        this.account = account;
        this.bank = bank;
        this.branch = branch;
        this.balance = balance;
        owner = "Anonimus";
    }

    public BankAccount(long account, String bank, int branch) {
        this.account = account;
        this.bank = bank;
        this.branch = branch;
        owner = "Anonimus";
    }

    public void display(){
        String str = "Owner: " + owner + " | Bank: " + bank + " | Branch: " + branch + " | Balance: " + balance;
        System.out.println(str);
    }

    public void display(boolean gender){
        String str = "Owner: " + (gender ? "Mr. " : "Mrs. ") + owner + " | Bank: " + bank + " | Branch: " + branch + " | Balance: " + balance;
        System.out.println(str);
    }

    // переопределение

    public long getAccount() {
        return account;
    }
    public String getBank() {
        return bank;
    }
    public void setBank(String bank) {
        this.bank = bank;
    }
    public int getBranch() {
        return branch;
    }
    public void setBranch(int branch) {
        this.branch = branch;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public double getBalance() {
        return balance;
    }

    public boolean deposit(double sum){
        balance += sum;
        return true;
    }

    public boolean withdraw(double sum){
       if (sum <= balance) {
           balance -= sum;
           return true;
       }
       return false;
    }

    public static void main(String[] args) {
    }

}
