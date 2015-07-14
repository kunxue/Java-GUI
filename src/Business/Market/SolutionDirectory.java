/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Market;

import java.util.ArrayList;

/**
 *
 * @author kunren
 */
public class SolutionDirectory 
{
    private ArrayList<Solution> solutionList;
    
    public SolutionDirectory()
    {
        solutionList = new ArrayList();
    }
    
    public ArrayList getSolutionList()
    {
        return solutionList;
    }
    
    public void setSolutionList(ArrayList sl)
    {
        solutionList = sl;
    }
    
    public Solution newSolution()
    {
        Solution s = new Solution();
        solutionList.add(s);
        return s;
        
    }
    public void addSolution(Solution s)
    {
        solutionList.add(s);
    }
    public void removeSolution(Solution s)
    {
        solutionList.remove(s);
    }

}

