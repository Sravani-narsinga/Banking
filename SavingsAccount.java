package comm.banking;
import java.util.Objects;
public class SavingsAccount extends Account
{
	private double balance;

public SavingsAccount(long accNo,String ifsc,double balance)
{
	super(accNo,ifsc);
	this.balance=balance;
}
public String toString(){
	return "SavingsAccount[balance="+ balance +"]";
	}
public int hashcode()
{
	return(int) this.balance;
}
  public boolean equals(Object obj)
  {
	  SavingsAccount sa=(SavingsAccount)obj;
	  return this.balance==sa.balance;
  }
  public String display()
  {
  return"current balance="+this.balance;
  }

}
