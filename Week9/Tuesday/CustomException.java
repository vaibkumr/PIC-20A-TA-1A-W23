public class CustomException {
    public static void main(String args[]){
        Account a1 = new Account(100);
        try{
            a1.withdraw(110);
        }         
        catch(NegativeFundsException e){
            System.out.print("NegativeFundsException");
        }         
        catch(InsufficientFundsException e){
            System.out.print("InsufficientFundsException");
        }  
        catch(Exception e){
            System.out.print("InsufficientFundsException");
        }               

    }
    
}



public class InsufficientFundsException extends RuntimeException {
    //what if we extend Exception instead of RuntimeException

    public InsufficientFundsException(String message) {
        super(message);
    }

}

public class NegativeFundsException extends InsufficientFundsException {
    //what if we extend Exception instead of RuntimeException

    public NegativeFundsException(String message) {
        super(message);
    }

}



public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount){
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds in account");
        }
        balance -= amount;
    }
}



