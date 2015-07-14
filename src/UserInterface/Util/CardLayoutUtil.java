package UserInterface.Util;

public class CardLayoutUtil
{
    
    private static CardLayoutJPanel SINGLETON = new CardLayoutJPanel();
    
    public CardLayoutUtil()
    {
    }
    
    public static CardLayoutJPanel getCardLayoutJPanel()
    {
        return SINGLETON;
    }    
}
