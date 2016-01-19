package conto.payload;

import java.io.Serializable;
import javax.jms.Destination;

/**
 *
 * @author Damiano Di Stefano, Marco Giuseppe Salafia
 */
public abstract class Request implements Serializable
{
    protected String clientID;
    protected Destination replyTo;

    public String getClientID()
    {
        return clientID;
    }

    public void setClientID(String clientID)
    {
        this.clientID = clientID;
    }

    public Destination getReplyTo()
    {
        return replyTo;
    }

    public void setReplyTo(Destination replyTo)
    {
        this.replyTo = replyTo;
    }
    
    
}
