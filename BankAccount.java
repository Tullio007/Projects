import java.util.Scanner;

class NewBankAccount {
    private int AccountNumber;
    private String AccountHolder;
    private double Balance;


    public NewBankAccount(int AccountNumber, String AccountHolder, double InitialDeposit){
        this.AccountHolder = AccountHolder;
        this.AccountNumber = AccountNumber;
        if (InitialDeposit > 0){
            this.Balance = InitialDeposit;
        }
        else{
            this.Balance = 0;
        }
    }

    public void Deposit(double value){
        if (value >= 0){
            Balance += value; 
        }        
        
    }

    public void Withdraw(double value){
        double TotalValue = value + 5;
        
        if (Balance >= TotalValue) {
            Balance -= TotalValue;
        } else {
            System.out.println("Insufficient balance to make the withdrawal and pay the fee");
        }
    }

    public void Data(){
        System.out.println("Account Data:");
        System.out.println("Account Holder: " + AccountHolder);
        System.out.println("Account Number: " + AccountNumber);
        System.out.println("Balance: " + Balance);
    }
}

public class BankAccount {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int AccountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String AccountHolder = sc.nextLine();

        System.out.print("Insert the amount of the initial value!: ");
        double InitialDeposit = sc.nextDouble();

        NewBankAccount account = new NewBankAccount(AccountNumber, AccountHolder, InitialDeposit);

        account.Data();

        System.out.println("Enter the amount for deposit: ");
        double DepositValue = sc.nextDouble();
        account.Deposit(DepositValue);
        System.out.println("Your account after the deposit: ");
        account.Data();

        System.out.println("Enter the withdraw value: ");
        double withdrawal = sc.nextDouble();
        account.Withdraw(withdrawal);
        System.out.println("Your account after the withdrawal: ");
        account.Data();

        sc.close();
    }
}