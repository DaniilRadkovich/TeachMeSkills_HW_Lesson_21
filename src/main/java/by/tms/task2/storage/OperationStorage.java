package by.tms.task2.storage;

import by.tms.task2.entity.Operation;

import java.util.ArrayList;
import java.util.List;

public class OperationStorage {
    List<Operation> operations = new ArrayList<>();

    public void save (Operation operation) {
        operations.add(operation);
    }

    public List<Operation> getAll() {
        return new ArrayList<>(operations);
    }

}
