package pl.kurs.modyfikatory;

public class Bank implements BankTransfer {

    private int transferFee = 1;

    public void transfer(BankAccount from, BankAccount to, int amount)
    {
        if(from.getAmount() < amount + transferFee){
            throw new IllegalArgumentException("Nie ma takiej sumy na tym koncie");
        }
        from.withdraw(amount + transferFee);
        to.deposit(amount);
    }


}
