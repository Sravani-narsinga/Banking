package comm.banking;

public class LoanAcc extends Account
{
	private double loanAmount;

	public LoanAcc(long accNo,String ifsc,double loanAmount)
	{
		super(accNo,ifsc);
		this.loanAmount=loanAmount;
	}
	public String toString(){
		return "LoanAcc[loanAmount="+ loanAmount +"]";
		}
	public int hashcode()
	{
		return(int) this.loanAmount;
	}
	  public boolean equals(Object obj)
	  {
		  LoanAcc Ia=(LoanAcc)obj;
		  return this.loanAmount==Ia.loanAmount;
	  }
	  public String display()
	  {
	  return"current balance="+this.loanAmount;
	  }
}
