package conto.record;

import java.io.Serializable;

/**
 *
 * @author Damiano Di Stefano, Marco Giuseppe Salafia
 */

public class OperationRecord implements Serializable
{
    private String operationID;
    private String userID;
    private double operationValue;
    private long currentDate;

    public OperationRecord(String operationID, String userID, double operationValue, long currentDate)
    {
        this.operationID = operationID;
        this.userID = userID;
        this.operationValue = operationValue;
        this.currentDate = currentDate;
    }

    public String getOperationID()
    {
        return operationID;
    }

    public String getUserID()
    {
        return userID;
    }

    public double getOperationValue()
    {
        return operationValue;
    }

    public long getCurrentDate()
    {
        return currentDate;
    }

    @Override
    public String toString()
    {
        return "OperationRecord{" + "operationID=" + operationID + ", userID=" + userID + ", operationValue=" + operationValue + ", currentDate=" + currentDate + '}';
    }
    
}
