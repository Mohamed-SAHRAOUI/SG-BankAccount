import java.util.ArrayList;
import java.util.List;

public class History {
    private List<Operation> operationList;

    public History() {
        operationList = new ArrayList<>();
    }

    public void addOperation(Operation operation) {
        operationList.add(operation);
    }

    public double getBalance() {
        return operationList.stream().mapToDouble(Operation::getAmount).sum();
    }
}
