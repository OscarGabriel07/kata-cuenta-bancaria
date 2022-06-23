import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {

    private String accountNumber;
    private int balance;
    private List<Movement> movements = new ArrayList<>();

    public Account() {
        this.balance = 0;
    }

    public void deposit(int amount, String date) {
        this.balance += amount;
        Movement movement = new Movement(date, amount, 0, this.balance);
        movements.add(movement);
    }

    public void withdraw(int amount, String date){
        if (this.balance >= amount){
            this.balance -= amount;
            Movement movement = new Movement(date, 0, amount, this.balance);
            movements.add((movement));
        }
    }

    public void printStatements() {
        System.out.println("date        |credit|debit|balance");
        for(Movement movement: movements){
            System.out.println(movement.getDate() + "  |"
                    + movement.getCredit() + "    |" + movement.getDebit()
                    + "|    " + movement.getBalance());
        }
    }

}
