package tests;
import main.MoneyBank;
import org.junit.Test;
import static org.junit.Assert.*;

public class MoneyBankTest{
	
	@Test
	public void testWithdrawOperationSufficeantBalance(){
	
		MoneyBank account=new MoneyBank("John Deo",10000);
		assertEquals(5000,account.withdraw(5000),0.02);
	}

	@Test
	public void testWithdrawOperationInsufficeantBalance(){
	
		MoneyBank account=new MoneyBank("John Deo",10000);
		assertEquals(0.0,account.withdraw(15000),0.02);
	}

	@Test
	public void testDepositBalance(){
	
		MoneyBank account1=new MoneyBank("John Deo",10000);
		assertEquals(25000,account1.deposit(15000),0.02);
	}
	
	@Test
	public void testNextAccountNumber(){
	
		assertEquals(MoneyBank.randomAccountNumber,MoneyBank.getNextAccountNumber());
	}
}

















