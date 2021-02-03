package day9;

class BankException extends Exception
{
	double balance;
	double amt;
	
	BankException(double balance,double amt)
	{
		this.balance=balance;
		this.amt=amt;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		String str="enter proper amt to withdraw .. less than balance";
		
		str=" ur account has" + balance+" and ur trying to withdraw ="+amt;
		return str;
	}
}
	class BankTrans{
		double balance;
	    public BankTrans(double balance) {
		super();
		this.balance = balance;
	}
	
	void withdraw(double amt){
	
		try {
			if(balance<=amt)
				throw new BankException(balance,amt);
			
			balance = balance +amt;
			System.out.println("after withdraw..balance ="+balance);
		}catch(BankException e)
		{
			System.out.println("e.getMessage()");
		}
		}
	}

	

public class UserDefinedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankTrans b=new BankTrans(10000);
		b.withdraw(11000);
	}

}
