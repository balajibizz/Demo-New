package org.bank;

public class BankInfo extends AxisBank {

	public void savings() {
		System.out.println("saving-24");

	}
	
	public void fixed() {
		System.out.println("fixed-10");
	}
	
	public static void main(String[] args) {
		BankInfo b=new BankInfo();
		
		b.savings();
		b.fixed();
		b.deposit();
		
		
	}
	
}
