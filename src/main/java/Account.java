enum ACCOUNT_TYPE{
    SAVINGS,
    CHECKING,
}

public class Account {
    private String accountOwner;
    private double interestRate;
    private double balance;
    private ACCOUNT_TYPE Atype;
    
public void display(){
    System.out.println(this.accountOwner);
    System.out.println(this.interestRate);
    System.out.println(this.balance);
}
public void deposit(double deposit){
    this.balance = balance;
    balance = balance + deposit;
    System.out.println("Your deposit of " + deposit + " was successful");
    System.out.println("Your current balance is now: " + balance);
    
}
public void withdraw(double withdraw){
    this.balance = balance;
    if(withdraw > balance){
        System.out.println("Withdraw amount exceeds current balance.");
    }
    if(withdraw <= balance){
        balance = balance - withdraw;
        System.out.println("Your withdraw of" + withdraw + " is successful");
        System.out.println("Your remaining balance is: " + balance);
                
    }
    
}
public void init(ACCOUNT_TYPE Atype, String accountOwner, double interestRate, double balance){
    this.Atype = Atype;
    this.accountOwner = accountOwner;
    this.interestRate = interestRate;
    this.balance = balance;
}
public String getaccountOwner(String accountOwner){
    this.accountOwner = accountOwner;
    return accountOwner;
}
public double getinterestRate(double interestRate){
    this.interestRate = interestRate;
    return interestRate;
}
public double getBalance(double balance){
    this.balance = balance;
    return balance;            
}
}
