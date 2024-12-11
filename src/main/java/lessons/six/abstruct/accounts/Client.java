package lessons.six.abstruct.accounts;

import java.math.BigDecimal;

public abstract class Client {

    private BigDecimal amount;
    private int account;

    public Client(BigDecimal amount, int account) {
        this.amount = amount;
        this.account = account;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public int getAccount() {
        return account;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public abstract void replacement(BigDecimal sum);

    public abstract BigDecimal withdraw(BigDecimal sum);

    protected abstract boolean getInformation(char type);

    public abstract void getInformation();

}
