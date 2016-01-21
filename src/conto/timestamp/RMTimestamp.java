package conto.timestamp;

import java.io.Serializable;

/**
 *
 * @author Damiano Di Stefano, Marco Giuseppe Salafia
 */

public class RMTimestamp implements Comparable<RMTimestamp>, Serializable, Cloneable
{
    private int counter;
    private String processID;

    @Override
    public int compareTo(RMTimestamp rmt)
    {
        return (this.counter != rmt.counter) ? Integer.compare(this.counter, rmt.counter) : 
                                               this.processID.compareToIgnoreCase(rmt.processID);
    }

    public RMTimestamp(int counter, String processID)
    {
        this.counter = counter;
        this.processID = processID;
    }

    public int getCounter()
    {
        return counter;
    }

    public void incrementCounter()
    {
        this.counter++;
    }

    public String getProcessID()
    {
        return processID;
    }

    @Override
    public String toString()
    {
        return "[" + counter + "," + processID + "]";
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    
    
    
    
}
