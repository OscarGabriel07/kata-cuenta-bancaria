import java.util.Date;

public class Movement {

    private int movementNumber;
    private String date;
    private int credit;
    private int debit;
    private int balance;

    public Movement(String date, int credit, int debit, int balance) {
        this.date = date;
        this.credit = credit;
        this.debit = debit;
        this.balance = balance;
    }

    public int getMovementNumber() {
        return movementNumber;
    }

    public void setMovementNumber(int movementNumber) {
        this.movementNumber = movementNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getDebit() {
        return debit;
    }

    public void setDebit(int debit) {
        this.debit = debit;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
