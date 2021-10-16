package week3.day1;

public class AxisBank extends BankInfo{
	@Override
	public void deposit() {
		System.out.println("the deposit is changed from 10000 to 15000");
	}
	public static void main(String[] args) {
		AxisBank obj=new AxisBank();
		obj.saving();
		obj.fixed();
		obj.deposit();
		
	}
	
}
