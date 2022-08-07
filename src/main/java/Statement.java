public class Statement {

    private double balance;

    private History history;

    public Statement() {
        this.balance = 0;
    }

    public Statement(History history, double balance) {
        this.history = history;
        this.balance = balance;
    }
    public void print(Statement statement) {
        System.out.println("History:");
        System.out.println("OPERATION  |  DATE  |  AMOUNT");
        statement.getHistory().printOperations();
        System.out.println("BALANCE : " + statement.getBalance());
    }

    public double getBalance() {
        return balance;
    }

    public History getHistory() {
        return history;
    }
}
