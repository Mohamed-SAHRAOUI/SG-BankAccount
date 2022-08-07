import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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
    public void deposit_amount_should_be_positive() {
        Account account = new Account();
        assertThrows(IllegalArgumentException.class,() -> account.deposit(-10),"Deposit amount should be positive");
    }

    @Test
    public void should_calculate_balance_when_make_deposit_and_withdraw() {
        Account account = new Account();
        account.deposit(150);
        account.deposit(130);
        account.withdraw(100);
        assertEquals(180, account.getBalance());
    }

    @Test
    public void withdraw_amount_should_be_positive() {
        Account account = new Account();
        assertThrows(IllegalArgumentException.class,() -> account.withdraw(-10),"Withdraw amount should be positive");
    }

    @Test
    public void verify_the_statement_printing_is_correct() {
        Account account = new Account();

//        list of operations
        account.deposit(150);
        account.deposit(500);
        account.withdraw(300);
        account.deposit(200);
        account.withdraw(100);

        final DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();

//        read output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

//        print statement
        Statement statement = account.getStatement();
        account.printStatement(statement);

        String result = outputStream.toString();
        System.out.println(result);

//        verify statement
        assertEquals("History:\r\n" +
                "OPERATION  |  DATE  |  AMOUNT\r\n" +
                "DEPOSIT  |  " + dateFormat.format(date) + "  |  150.0\r\n" +
                "DEPOSIT  |  " + dateFormat.format(date) + "  |  500.0\r\n" +
                "WITHDRAW  |  " + dateFormat.format(date) + "  |  -300.0\r\n" +
                "DEPOSIT  |  " + dateFormat.format(date) + "  |  200.0\r\n" +
                "WITHDRAW  |  " + dateFormat.format(date) + "  |  -100.0\r\n" +
                "BALANCE : 450.0\r\n", result);

    }


}
