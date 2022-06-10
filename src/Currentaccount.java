
public class Currentaccount extends Account{
	int currentBalance;
	Currentaccount(String a,int b,int c)
	{
		super(a,b);
		currentBalance=c;
		
	}
	void display()
	{
		System.out.println("customerName is"+customerName);
		System.out.println("AccountNo is"+accountNo);
		System.out.println("currentBalance is"+currentBalance);
	}

}
