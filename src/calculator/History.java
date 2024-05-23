package calculator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class History {

    private ArrayList<OperationRecord> operations;

    public History() {
        this.operations = new ArrayList<>();
    }

    public void addOperation(OperationRecord operation) {
        this.operations.add(operation);
    }

    public ArrayList<OperationRecord> getOperations() {
        return operations;
    }

    public void sortOperationsByTimestamp() {
        Collections.sort(operations, new Comparator<OperationRecord>() {
            @Override
            public int compare(OperationRecord o1, OperationRecord o2) {
                return o1.getTimestamp().compareTo(o2.getTimestamp());
            }
        });
    }
}
