package pl.kurs.modyfikatory;

public class BankAccount implements Account {

    private int amount;

    public BankAccount()
    {
        this(0);
    }

    public BankAccount(int amount)
    {
        this.amount = amount;
    }

    public void deposit(int amount)
    {
        this.amount += amount;
    }

    public void withdraw(int amount)
    {
        if(amount > this.amount){
            throw new IllegalArgumentException("Nie ma takiej sumy na tym koncie");
        }
        this.amount -= amount;
    }

    public int getAmount()
    {
        return amount;
    }


}
