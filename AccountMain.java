package comm.banking;

public class AccountMain {
    public static void main(String args[])
    {
    	SavingsAccount s1=new SavingsAccount(27455794546L,"ICIC00908",2245.345);
    	SavingsAccount s2=new SavingsAccount(7645391432L,"ICIC00888",5543.345);
    	SavingsAccount s3=new SavingsAccount(89456732181L,"CNRB00199",4532.641);
    	
    	System.err.println("user1 Savings account details...");
    	System.out.println(s1.toString());
    	System.out.println(s1.display());
    	System.out.println(s1.hashcode());
    	
    	System.err.println("user2 Savings account details...");
    	System.out.println(s2.toString());
    	System.out.println(s2.display());
    	System.out.println(s2.hashcode());
    	
    	System.out.println(s1.equals(s2));
    	System.out.println(s1.equals(s3));
    	
    	LoanAcc l1=new LoanAcc(2737181910089L,"ICICI00908",2245.987);
    	LoanAcc l2=new LoanAcc(7273818194500L,"ICICI00908",44519.987);
    	LoanAcc l3=new LoanAcc(2737181910089L,"ICICI00908",6784.987);
    	
    	System.err.println("user1 loan account details...");
    	System.out.println(l1.toString());
    	System.out.println(l2.toString());
    	System.out.println(l3.toString());
    	
    	System.out.println(l1.equals(l2));
    	System.out.println(l1.equals(l3));
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
}
