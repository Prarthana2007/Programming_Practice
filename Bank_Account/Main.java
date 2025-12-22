class BankAccount{
    private int accountNumber;
    private int balance;

    public BankAccount(int accNo,int initialDeposit){
        accountNumber=accNo;
        balance=initialDeposit;
    }
    public BankAccount(int accNo){
        accountNumber=accNo;
        balance=0;
    }
    public void deposit(int amount){
        balance=balance+amount;
    }
    public void withdraw(int amount){
        if(amount<=balance){
            balance=balance-amount;
        }
        else{
            System.out.println("Balance unavailable");
        }
    }
    public void display(){
        System.out.println("Account Number:"+accountNumber);
        System.out.println("Balance:"+balance);
    }
public static void main(String args[]){
        BankAccount acc1=new BankAccount(1,1000);
        BankAccount acc2=new BankAccount(2);
        acc1.deposit(2000);
        acc1.withdraw(1000);
        acc2.deposit(5000);
        acc1.display();
        acc2.display();
}
}