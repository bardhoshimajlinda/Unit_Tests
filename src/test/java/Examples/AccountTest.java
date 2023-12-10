package Examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @Test
    public void testTransferBetweenAccounts() {
        // Given
        Account senderAccount = new Account("12345678901234567890123456", "Sender Name", 1000.0);
        Account receiverAccount = new Account("98765432109876543210987654", "Receiver Name", 500.0);


        double transferAmount = 200.0;
        senderAccount.transfer(receiverAccount, transferAmount);

        assertEquals(800.0, senderAccount.getBalance(), 0.001);
        assertTrue(senderAccount.getAccountNumber().length() == 26);
        assertNotNull(senderAccount.getOwnerName());

        assertEquals(700.0, receiverAccount.getBalance(), 0.001);
        assertTrue(receiverAccount.getAccountNumber().length() == 26);
        assertNotNull(receiverAccount.getOwnerName());
    }

    @Test
    public void testInvalidAccountNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Account(null, "Sender Name", 1000.0);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Account("987654321098765432109876540", "Receiver Name", 500.0);
        });
    }

    @Test
    public void testInsufficientFunds() {
        Account senderAccount = new Account("12345678901234567890123456", "Sender Name", 100.0);
        Account receiverAccount = new Account("98765432109876543210987654", "Receiver Name", 500.0);

        assertThrows(IllegalArgumentException.class, () -> {
            senderAccount.transfer(receiverAccount, 200.0);
        });
    }
}