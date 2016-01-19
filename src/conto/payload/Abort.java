package conto.payload;

import java.io.Serializable;

/**
 *
 * @author Damiano Di Stefano, Marco Giuseppe Salafia
 */
public class Abort implements Serializable
{
    private String messageID;

    public Abort(String messageID)
    {
        this.messageID = messageID;
    }

    public String getMessageID()
    {
        return messageID;
    }
}
