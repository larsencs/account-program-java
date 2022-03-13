import java.util.Scanner;

public class accountProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Account savingsOne = new Account();
        Account checkingOne = new Account();
        
        savingsOne.init(ACCOUNT_TYPE.SAVINGS, "Robert Paulson", 2.5, 5.0);
        checkingOne.init(ACCOUNT_TYPE.CHECKING, "Robert Paulson", 0, 25.0);
        
        System.out.println("What would you like to do?");
        System.out.println("1 to see account details");
        System.out.println("2 to make a deposit");
        System.out.println("3 to make a withdraw");
        int choice = scan.nextInt();
        

        switch(choice){
            case 1:
                System.out.println("Which account would you like to display?");
                System.out.println("1 for savings");
                System.out.println("2 for checking");
                int accountChoice = scan.nextInt();
                if(accountChoice == 1 ){
                    savingsOne.display();
                }
                if(accountChoice == 2){
                    checkingOne.display();
                }
                if(accountChoice > 2 || accountChoice < 1){
                    System.out.println("Invalid Option");
                }
                break;
            case 2:
                System.out.println("Which account would you like to deposit into?");
                System.out.println("1 for savings");
                System.out.println("2 for checking");
                accountChoice = scan.nextInt();
                if(accountChoice == 1){
                    System.out.println("Enter the amount to deposit:");
                    savingsOne.deposit(scan.nextDouble());
                }
                if(accountChoice == 2){
                    System.out.println("Enter the amount to deposit: ");
                    checkingOne.deposit(scan.nextDouble());
                }
                if(accountChoice < 1 || accountChoice > 2){
                    System.out.println("Invalid option");
                }
                break;
            case 3:
                System.out.println("Which account would you like to withraw from?");
                System.out.println("1 for savings");
                System.out.println("2 for checking");
                accountChoice = scan.nextInt();
                if(accountChoice == 1 ){
                    System.out.println("Enter withdraw amount: ");
                    savingsOne.withdraw(scan.nextDouble());
                }
                if(accountChoice == 2){
                    System.out.println("Enter withdraw amount: ");
                    checkingOne.withdraw(scan.nextDouble());
                }
                if(accountChoice < 1 || accountChoice > 2){
                    System.out.println("Invalid option");
                }
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
        
    }
    
}
