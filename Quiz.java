import java.util.*;
import java.io.*;
/**
* Class to help user study terms that go together
*@author John Elizarraras
*@version 0.1.0
*/

public class Quiz
    {
    Scanner in = new Scanner(System.in);
    public int i;
    public String[] words = new String[500];
    public String response;
    public Random rand = new Random();
    public String first;
    public String last;
    public int r;
    /**
    *The first method in class
    *@return returns the getStarted method
    */
    public String quiz()
    {
        
        return getStarted();
    }
    /**
    *Sets the variables as needed and greets user.
    *@return returns the getWords method.
    */
    
    public String getStarted()
    {
        i = -1;
        System.out.println("Hello, we are getting started here.");
        return getWords();
    }
    /**
    * Puts the terms that the user wants into a string array for use later
    *@return returns the startQuiz method.
    *@return returns the getWords Method so that the user can add more to array
    */
    public String getWords()
    {
        System.out.println("What is the first term?(Type --- if you are done)");
            response = in.nextLine();
        if(response.equals("---"))
        {
        return startQuiz();    
        }
        else
        {
            i++;
            words[i] = response;
            System.out.println("What is the corresponding term?");
            response = in.nextLine();
            i++;
            words[i] = response;
            return getWords();
        }
    
 }
    /**
    *Informs user of how to use the qq method.
    *@return returns the qq method.
    */
    public String startQuiz()
    {
        System.out.println("Press Enter When You Want Start or Reveal Info(type reset to create a new list)");
        return qq();
    }
    /**
    * the method that actually quizzes user and allows to see answer to term
    *@return returns getStarted method if they want to restart the list
    *@return returns qq so they can keep studing
    */
    public String qq()
    {
        response = in.nextLine();
        if(response.equalsIgnoreCase("reset"))
        {
            return getStarted();
        }
        else
        {
        r = rand.nextInt(i+0);
        System.out.println(words[r]);
       response = in.nextLine();
        if(response.equalsIgnoreCase("reset"))
        {
            return getStarted();
        }
            else
                {
        System.out.println(words[corr(r)]);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
            return qq();
            }
        }
    }
    /**
    * finds the corresponding string to the term
    *@param r random number generated to the first string
    *@return returns number corresponding to the correct string
    */
    public int corr(int r)
    {
        if(r == 0)
        {
            return 1;
        }
        else if(r % 2 == 0)
        {
            return r + 1;
        }
        else
        {
            return r - 1;
        }
        
    }
    
}