package by.tms.task2.service;

import by.tms.task2.entity.Operation;
import by.tms.task2.entity.User;
import by.tms.task2.storage.OperationStorage;

import java.util.List;

public class CalculationService {
    private static final OperationStorage operationStorage = new OperationStorage();

    public static Double calc(double a, double b, String operand, User user) {
        switch (operand) {
            case "sum": {
                return getOperation(a, b, operand, a + b, user);
            }
            case "diff": {
                return getOperation(a, b, operand, a - b, user);
            }
            case "mult": {
                return getOperation(a, b, operand, a * b, user);
            }
            case "div": {
                return getOperation(a, b, operand, a / b, user);
            }
        }
        return null;
    }

    public List<Operation> findAll() {
        return operationStorage.getAll();
    }

    public static Double getOperation(double a, double b, String operand, double result, User user) {
        Operation operation = new Operation(a, b, operand, result, user);
        operationStorage.save(operation);
        return result;
    }
}
