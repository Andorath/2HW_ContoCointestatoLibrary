package conto.payload;

import conto.timestamp.RMTimestamp;

/**
 *
 * @author Damiano Di Stefano, Marco Giuseppe Salafia
 */
public class Commitment extends Proposal
{
    public Commitment(String messageID, RMTimestamp timestamp)
    {
        super(messageID, timestamp);
    }   
}
