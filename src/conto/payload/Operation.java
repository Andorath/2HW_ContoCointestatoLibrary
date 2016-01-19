package conto.payload;

import java.util.UUID;

/**
 *
 * @author Damiano Di Stefano, Marco Giuseppe Salafia
 */
public class Operation extends Request
{
    private OperationType type;
    private final String operationID = UUID.randomUUID().toString().substring(25, 35);
    private double operationValue;
    
    
    public enum OperationType
    {
        DEPOSIT,
        WITHDRAW;
    }

    public Operation(String clientID, OperationType operationType, double operationValue)
    {
        this.clientID = clientID;
        this.type = operationType;
        this.operationValue = operationValue;
    }

    public String getClientID()
    {
        return clientID;
    }

    public OperationType getOperationType()
    {
        return type;
    }

    public double getOperationValue()
    {
        return (this.type == OperationType.DEPOSIT) ? operationValue : -(operationValue);
    }

    public String getOperationID()
    {
        return operationID;
    }
    
    
    
}
