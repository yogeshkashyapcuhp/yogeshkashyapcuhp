// ATM Class for Use various Function
public class ATMFunction {
    private long depositAmount;
    private long withdrawAmount;
    private long balance;

    // Blank Default Constructor:An empty constructor provides us with the instance of an object.
    // We might need to use setters to set the necessary properties for it.
    //The empty constructor can be used when we want to make sure that any instance created is always valid
    // and the variables are initialized. We can use the empty constructor to define the default values.

    ATMFunction()
    {

    }
    // getter setter method:private variables can only be accessed within the same class (an outside class has no access to it).
    // However, it is possible to access them if we provide public get and set methods.
    //The get method returns the variable value, and the set method sets the value.
    public long getBalance() {
        return balance;
    }
    public void setBalance(long balance)
    {
        this.balance=balance;
    }
    public long getDepositAmount(){
        return depositAmount;
    }
    public void setDepositAmount(long depositAmount)
    {
        this.depositAmount=depositAmount;
    }
    public long getWithdrawAmount()
    {
        return withdrawAmount;
    }
    public void setWithdrawAmount(long withdrawAmount)
    {
        this.withdrawAmount=withdrawAmount;
    }

}
