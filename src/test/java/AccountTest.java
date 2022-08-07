import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {

    @Test
    public void should_increase_balance_when_make_deposit() {
        Account account = new Account();
        account.deposit(150.50);
        assertEquals(150.50, account.getBalance());
    }

    @Test
    public void amount_should_be_positive() {
        Account account = new Account();
        assertThrows(IllegalArgumentException.class,() -> account.deposit(-10),"Deposit amount should be positive");
    }

}
