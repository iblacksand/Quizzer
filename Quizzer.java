import java.util.*;
/**
*Class to start the quiz clas
*@author John Elizarraras
*@version 0.1.0
*/

public class Quizzer
{
    /**
    *Main method for the quizzer
    *@param args arguments for starting program
    */
    public static void main(String[] args)
    {
        Quiz q = new Quiz();
        Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equalsIgnoreCase("Exit"))
		{
			 System.out.println(q.quiz());
		}
       
    }
}