
public class BankAccount
{
   private double balance;

   public BankAccount()
   {
      balance = 0;
   }

   public void interest(double amount)
   {
	   balance = balance + amount * balance; 
		
   }
   
   
   
   
   public void withdraw(double amount)
   {
      balance = balance - amount;
   }

   public double getBalance()
   {
      return balance;
   }
}
