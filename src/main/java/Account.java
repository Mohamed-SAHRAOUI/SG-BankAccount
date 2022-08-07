
public class Account {

    private Statement statementPrinter;

    private History history;

    public Account() {
        this.statementPrinter = new Statement();
        this.history = new History();
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Deposit amount should be positive");
        }
        history.addOperation(Operation.deposit(amount));
    }

    public double getBalance() {
        return history.getBalance();
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Deposit amount should be positive");
        }
        history.addOperation(Operation.withdraw(amount));
    }

    public void printStatement(Statement statement) {
        statementPrinter.print(statement);
    }

    public Statement getStatement() {
        double balance = getBalance();
        return new Statement(history, balance);
    }
}
