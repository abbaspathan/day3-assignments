package main;
import java.util.Random;

public class MoneyBank{
	
	private String accountHolderName;
	private double accountBalance;
	private long accountNumber;
	public static long randomAccountNumber;

	static{
		randomAccountNumber=234567;
	}

	public MoneyBank(){
		accountNumber=randomAccountNumber++;
	}

	public MoneyBank(String accountHolderName,double initialBalance){
		this();
		this.accountHolderName=accountHolderName;
		this.accountBalance=initialBalance;
	}

	public String getaccountHolderName(){
		return accountHolderName;
	}

	public void setaccountHolderName(String accountHolderName){
		this.accountHolderName=accountHolderName;
	}

	public void setaccountBalance(double accountBalance){
		this.accountBalance=accountBalance;
	}

	public double getaccountBalance(){
		return accountBalance;
	}

	public long getaccountNumber(){
		return accountNumber;
	}

	public double withdraw(double amount){
		
		if(accountBalance>=amount){
			accountBalance=accountBalance-amount;
			return accountBalance;
		}
		else{
			System.out.println("You Don't have sufficeant balance.");
			return 0.0;
		}
	}	

	public double deposit(double amount){

		accountBalance=accountBalance+amount;
		return accountBalance;
	}
	
	public String toString(){
		
		System.out.println("Account Holder Name :"+accountHolderName);
		System.out.println("Account Number :"+accountBalance);
		System.out.println("Account Balance :"+accountNumber);
		return " ";
	}
	
	public static long getNextAccountNumber(){
		return randomAccountNumber;
	}
	
}
