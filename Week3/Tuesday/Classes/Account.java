/*
  This snippet rewrites the C++ code from lecture 1 using JAVA.

  We've also added
   - an instance field called dateOfCreation
   - an instance method called getDateOfCreation
   - an instance initializer block
   - a static initializer block

  An instance initializer block executes
  every time the class is instantiated,
  and it executes right before the constructor.
  They can save us from rewriting the same code
  for every constructor.

  Static initializer blocks execute
  as soon as the class is loaded.
  These are mostly used to initialize static fields.

  There are two ways to initialize a final static field:
   - in its declaration; or
   - in a static initializer block.

  There are three ways to initialize a final instance field:
   - in its declaration;
   - in an instance initializer block; or
   - in a constructor.
*/


class Account {
    // static field
    private static double bankMoney;


    // instance fields
    private double balance;
    private final String dateOfCreation;


    // static initializer block - called when the class is created
    static {
        bankMoney = 0;

        // could also have written
        // private static double bankMoney = 0;
        // when declaring bankMoney
    }


    // static methods
    public static double getBankMoney() {               // can only use static fields
        return bankMoney;
    }
    public static void updateBankMoney(double change) { // can only use static fields
        bankMoney += change;
    }


    // instance initializer block - called immediately before constructor
    {
        dateOfCreation = (new java.util.Date()).toString();

        // could also have written
        // private String dateOfCreation = (new java.util.Date()).toString();
        // when declaring dateOfCreation
    }


    // constructor
    public Account(double balance) {
        Account.bankMoney += balance;  // can access static   field with Account.{}
        this.balance       = balance;  // can access instance field with    this.{}
    }


    // instance methods
    public double getBalance() {
        return balance;
    }
    public void updateBalance(double change) {
        bankMoney += change;           // can access static   field without Account.{}
        balance   += change;           // can access instance field without    this.{}
    }
    public String getDateOfCreation() {
        return dateOfCreation;
    }
}