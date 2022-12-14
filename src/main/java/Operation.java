import java.util.Date;

public class Operation {
    private OperationType type;
    private Date date;
    private double amount;

    public Operation(OperationType type, double amount) {
        this.type = type;
        this.amount = amount;
        this.date = new Date();
    }

    public static Operation deposit(double amount) {
        return new Operation(OperationType.DEPOSIT, amount);
    }

    public static Operation withdraw(double amount) {
        return new Operation(OperationType.WITHDRAW, -amount);
    }

    public double getAmount() {
        return amount;
    }

    public OperationType getType() {
        return type;
    }

    public Date getDate() {
        return date;
    }
}
