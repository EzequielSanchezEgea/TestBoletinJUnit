package es.iessoterohernandez.daw.endes.boletinJUnit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class AccountTest {
	private static Account account;

	@BeforeEach
	public void init() {
		account = new Account("Ezequiel", 123456789, 100);
	}

	@Test
	public void testDeposit() {

		assertTrue(account.deposit(50));
		assertEquals(150, account.getBalance());
		assertFalse(account.deposit(-50));
	}

	@Test
	public void testWithdraw() {

		assertTrue(account.withdraw(50, 0));
		assertEquals(50, account.getBalance());
		
		
	}
	@Test
    public void testGetAccountNumber()
    {
        assertEquals(123456789, account.getAccountNumber());
    }
	
	@Test
    public void testAddInterest()
    {
        float initialBalance = account.getBalance();
        account.addInterest();
        float finalBalance = account.getBalance();
        assertEquals(104.5f, finalBalance);
    }
	
	@Test
	public void testDecimalFailure() {
		float balance = account.getBalance();
		for (int i = 0; i<100; i++) {
			balance += 0.23f;
		}
		assertNotEquals(balance,773f);

	}
	
	@Test
    public void testToString()
    {

        assertEquals("123456789\tEzequiel\t1000 €", account.toString());
}
}