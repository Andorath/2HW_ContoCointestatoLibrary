package conto.payload;

import conto.timestamp.RMTimestamp;
import java.io.Serializable;

/**
 *
 * @author Damiano Di Stefano, Marco Giuseppe Salafia
 */

public class Proposal implements Serializable, Comparable<Proposal>
{
    private String messageID;
    private RMTimestamp timestamp;

    public Proposal(String messageID, RMTimestamp timestamp)
    {
        this.messageID = messageID;
        this.timestamp = timestamp;
    }

    public String getMessageID()
    {
        return messageID;
    }

    public RMTimestamp getTimestamp()
    {
        return timestamp;
    }

    @Override
    public int compareTo(Proposal p)
    {
        return timestamp.compareTo(p.timestamp);
    }
}
