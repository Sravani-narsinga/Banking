package comm.banking;

public class Account {
	private long accNo;
	private String ifsc;
	
	public Account(long accNo,String ifsc)
	{
		this.accNo=accNo;
		this.ifsc=ifsc;
	
}
	public String toString()
	{
		return "Account [accNo="+ accNo +",ifsc=" + ifsc +"]";
	}
	public boolean equals(Object obj)
	{
		Account ac=(Account)obj;
		return this.ifsc.equals(ac.ifsc);
	}
	public int hashcode()
	{
		return (int) this.accNo+ this.ifsc.hashCode();
	}
}