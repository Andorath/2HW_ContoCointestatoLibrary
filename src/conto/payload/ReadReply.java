package conto.payload;

import conto.record.OperationRecord;
import conto.timestamp.RMTimestamp;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Damiano Di Stefano, Marco Giuseppe Salafia
 */
public class ReadReply implements Comparable<ReadReply>, Serializable
{
    private String messageID;
    private RMTimestamp versionNumber;
    private List<OperationRecord> operations;

    public ReadReply(String messageID, RMTimestamp timestamp, List<OperationRecord> operations)
    {
        this.messageID = messageID;
        this.versionNumber = timestamp;
        this.operations = operations;
    }

    public String getMessageID()
    {
        return messageID;
    }

    public RMTimestamp getTimestamp()
    {
        return versionNumber;
    }
    
    public List<OperationRecord> getOperations()
    {
        return operations;
    }

    @Override
    public int compareTo(ReadReply rr)
    {
        return versionNumber.compareTo(rr.versionNumber);
    }
}
