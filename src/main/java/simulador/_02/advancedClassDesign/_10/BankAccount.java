package simulador._02.advancedClassDesign._10;

interface Account{
	public default String getId() {
		return "0000";
	}
}

interface PremiumAccount extends Account{
	public String getId();
	
//	public String getId() {
//		super.getId();
//	}
}

public class BankAccount implements PremiumAccount{
	public static void main(String[] args) {
		Account acct = new BankAccount();
		System.out.println(acct.getId());
	}

//	@Override
//	public String getId() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
