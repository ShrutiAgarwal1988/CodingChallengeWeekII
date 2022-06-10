
public class AccountDetails extends Currentaccount{
	int depositAmount,withdrawalAmount;
	AccountDetails(String a,int b,int c,int d,int e)
	{
		super(a,b,c);
		depositAmount=d;
		withdrawalAmount=e;
		
	}
	void display()
	{ 
		super.display();
		
		System.out.println("customerName is"+depositAmount);
		System.out.println("AccountNo is"+withdrawalAmount);
	
	}
}
