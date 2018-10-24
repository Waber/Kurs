package pl.kurs.modyfikatory;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankTest {
    private BankAccount a1;
    private BankAccount a2;
    private Bank bank;

    @BeforeEach
    public void setUp()
    {
        a1 = new BankAccount(10);
        a2 = new BankAccount(2);
        bank = new Bank();
    }

    @Test
    public void shouldTransferMoney()
    {
        bank.transfer(a1,a2,5);
        Assert.assertEquals(7,a2.getAmount());
    }

    @Test
    public void shouldSubstractMoneyFromAccount()
    {
        bank.transfer(a1,a2,5);
        Assert.assertEquals(4,a1.getAmount());
    }

    @Test
    public void shouldThrowExceptionWhenTransferAmountBiggerThenAccountAmount()
    {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,() -> bank.transfer(a2,a1,5));
        Assert.assertEquals("Nie ma takiej sumy na tym koncie",exception.getMessage());
    }

}
