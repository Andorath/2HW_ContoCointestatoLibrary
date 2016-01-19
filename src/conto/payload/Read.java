package conto.payload;

/**
 *
 * @author Damiano Di Stefano, Marco Giuseppe Salafia
 */
public class Read extends Request
{
    public Read(String clientID)
    {
        this.clientID = clientID;
    }
}
