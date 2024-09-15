public class Main
{
    public static void main(String[] args) {
        BankAccount account =new BankAccount("123456",100.0);

    try{
        account.deposit(50.0);
        try{
            account.withdraw(200.0);
        }
        catch (InsufficientFundsException e)
        {
            System.out.println(e.getMessage());
        }
        account.withdraw(50.0);
        try {
            account.deposit(-10.0);
        }
        catch (InvalidAmountException e){
            System.out.println(e.getMessage());
        }
        }
    catch (InvalidAmountException|InsufficientFundsException e){


        System.out.println("Error:"+e.getMessage());
    }
     finally {
        System.out.println("Final balance:$"+account.getBalance());
        System.out.println("Transction complete.");
    }
}
}
