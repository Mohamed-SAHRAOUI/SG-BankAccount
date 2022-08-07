import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class History {
    private List<Operation> operationList;

    private final DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public History() {
        operationList = new ArrayList<>();
    }

    public void addOperation(Operation operation) {
        operationList.add(operation);
    }

    public double getBalance() {
        return operationList.stream().mapToDouble(Operation::getAmount).sum();
    }

    public void printOperations() {
        for (Operation operation : operationList){
            System.out.println(
                    operation.getType() +
                            "  |  " +
                            dateFormat.format(operation.getDate()) +
                            "  |  " +
                            operation.getAmount());
        }
    }
}
