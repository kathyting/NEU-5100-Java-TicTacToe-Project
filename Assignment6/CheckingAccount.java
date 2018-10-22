
public class CheckingAccount extends Account{

	static private double MinBalance=100;
	static private double Fee=10;
	public CheckingAccount(String fname,String lname,double cb){
		
	super(fname,lname,cb);
	}
	public double DebitTransaction(double debitAmount){
		double resultingBalance=super.DebitTransaction(debitAmount);
		if(resultingBalance<MinBalance){
			ChargeFee();
		}
	 return CurBalance;
	}
	public double CreditTransaction(double creditAmount){
		
		this.CurBalance=super.CreditTransaction(creditAmount);
		if(this.CurBalance<MinBalance){
			ChargeFee();
		}
		return this.CurBalance;
	}
	private void ChargeFee(){
		this.CurBalance=this.CurBalance-Fee;
	}
	public static void main(String[] args) {
		CheckingAccount ch1=new CheckingAccount("Steve","Jobs",50);
		System.out.println(ch1);
		
		ch1.DebitTransaction(0.25);
		System.out.println(ch1);
		
		ch1.CreditTransaction(7.00);
		System.out.println(ch1);
		
		ch1.CreditTransaction(1000000);
		System.out.println(ch1);
		
		

	}

}
