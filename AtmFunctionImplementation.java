import java.util.HashMap;
import java.util.Map;
public class AtmFunctionImplementation implements AtmFunctionInterface{
    ATMFunction atmf = new ATMFunction();// Make object because "balance, depositAmount and withdrawAmount are
  //  present in ATM Function class
    HashMap<Long,String> ministatement=new HashMap<>();// Long is Key and String is value corresponding to key
  // use Hash Map in withdrawAmount() and in depositAmount()

    @Override
    public void depositAmount(long depositAmount)
    {
      ministatement.put(depositAmount," Rs. Amount Deposited");// insert value in hash map(key and value)
      System.out.println("Rs. "+depositAmount+" Deposited Successfully!");
      atmf.setBalance(atmf.getBalance()+depositAmount);
      viewBalance();//after perform Function, Function Called to check Balance
    }
    @Override
    public void withdrawAmount(long withdrawAmount)
    {
      if(withdrawAmount<= atmf.getBalance()) {
        ministatement.put(withdrawAmount," Rs. Amount Withdraw");// insert value in hash map(key and value)
        System.out.println("Rs. " + withdrawAmount + " Withdraw from your Account.\nPlease Collect your Cash");
        atmf.setBalance(atmf.getBalance() - withdrawAmount);
        viewBalance();
      }
      else
      {
        System.out.println("Insufficient Balance");
      }
    }
    @Override
    public void viewBalance()
    {
        System.out.println("Available Balance is Rs. "+atmf.getBalance());
    }
    @Override
    public void viewMiniStatement()// We can use this by Hash map. Create Hash Map in Starting of this class
    {
      for(Map.Entry<Long,String> m: ministatement.entrySet())
      {
        System.out.println(m.getKey()+""+m.getValue());
      }
    }
}
