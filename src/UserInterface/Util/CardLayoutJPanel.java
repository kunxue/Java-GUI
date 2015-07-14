package UserInterface.Util;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import javax.swing.JPanel;

public class CardLayoutJPanel extends JPanel
{
    public CardLayoutJPanel() 
    {
        this.setLayout(new CardLayout());
    }
    
    public void addAndMoveToNextJPanel(String name, JPanel jpanel)
    {
        if (isCardLayout())
        {
            try
            {
                jpanel.setName(name);
                this.add(jpanel.getName(), jpanel);
                CardLayout cardLayout = (CardLayout) this.getLayout();
                cardLayout.next(this);
            }
            catch (Exception e)
            {
                System.out.println(this.getClass().toString() + " - There was a problem adding the JPanel.");
            }
        } 
    }
    
    public void addAndMoveToNextJPanel(String name, JPanel jpanel, boolean removeAllJPanels)
    {
        if (isCardLayout())
        {
            if (removeAllJPanels)
            {
                this.removeAll();
            }
            
            try
            {
                jpanel.setName(name);
                this.add(jpanel.getName(), jpanel);
                CardLayout cardLayout = (CardLayout) this.getLayout();
                cardLayout.next(this);
            }
            catch (Exception e)
            {
                System.out.println(this.getClass().toString() + " - There was a problem adding the JPanel.");
            }
        } 
    }
        
    public void removeAndMoveToPreviousJPanel(JPanel jpanel)
    {
        if (isCardLayout())
        {
            try
            {
                this.remove(jpanel);
                CardLayout cardLayout = (CardLayout) this.getLayout();
                cardLayout.previous(this);
            }
            catch (Exception e)
            {
                System.out.println(this.getClass().toString() + " - There was a problem removing the JPanel.");
            }
        } 
    }
   
    private boolean isCardLayout()
    {
        if (this.getLayout() instanceof CardLayout)
        {
            return true;
        }
        return false;
    }
    
    public void printJPanelsInCardLayout()
    {        
        if (isCardLayout())
        {
            JPanel jpanel;
            if (this.getComponentCount() > 0)
            {
                for (Object objectJPanel : this.getComponents())
                {
                    try
                    {
                        jpanel = (JPanel) objectJPanel;
                        System.out.println(jpanel.getName());
                    }
                    catch (ClassCastException e)
                    {
                        System.out.println(this.getClass().toString() + " - Could not cast the object to Jpanel.");
                    }
                    catch (Exception e)
                    {
                        System.out.println(this.getClass().toString() + " - There was a general error.");
                    }
                }
            }
            else
            {
               System.out.println(this.getClass().toString() + " - There are no components in your CardLayout.");
            }
        }
        else
        {
            System.out.println(this.getClass().toString() + " - This JPanel does not have a CardLayout.");
        }
    }
}
