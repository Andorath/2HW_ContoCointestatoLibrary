package conto.record;

import conto.payload.Operation;
import conto.payload.Request;
import conto.timestamp.RMTimestamp;
import conto.payload.Read;

/**
 *
 * @author Damiano Di Stefano, Marco Giuseppe Salafia
 */
public class PendingRequest implements Comparable<PendingRequest>
{
    private String messageID;
    private RMTimestamp timestamp;
    private Request request;
    private boolean committed;

    public PendingRequest(String messageID, RMTimestamp timestamp, Request request)
    {
        this.messageID = messageID;
        this.timestamp = timestamp;
        this.request = request;
        this.committed = (request instanceof Read);
    }

    @Override
    public String toString()
    {
        return "PendingRequest{" + "messageID=" + messageID + ", timestamp=" + timestamp + ", request=" + request + ", committed=" + committed + '}';
    }

    public String getMessageID()
    {
        return messageID;
    }
    
    public RMTimestamp getTimestamp()
    {
        return timestamp;
    }

    public Request getRequest()
    {
        return request;
    }

    public boolean isCommitted()
    {
        return committed;
    }

    public void setTimestamp(RMTimestamp timestamp)
    {
        this.timestamp = timestamp;
    }

    public void setAsCommitted()
    {
        this.committed = true;
    }
    
    public boolean isOperation()
    {
        return (request instanceof Operation);
    }

    @Override
    public int compareTo(PendingRequest pr)
    {
        return this.timestamp.compareTo(pr.timestamp);
    }
}
