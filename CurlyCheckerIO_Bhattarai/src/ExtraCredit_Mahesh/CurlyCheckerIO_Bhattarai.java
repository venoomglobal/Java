package ExtraCredit_Mahesh;
// Program that checks to see if number of curly braces is balanced

import java.util.*;

public class CurlyCheckerIO_Bhattarai {

   

    public static void main(String[] args) {

        CurlyCheckerIO_helper helper = new CurlyCheckerIO_helper();
        
        System.out.println("---First File---");
        
// Empty stack

        Stack<Character> stack = new Stack();

        String s1 = "SportsTeam1.java";
        String s2 = "sportsTeam2.java";
        boolean test = false;

        //prints if stack is balanced or not
        CurlyCheckerIO_helper.display(s1, stack, test);
        
        System.out.println("\n---Second File---");
        //prints if stack is balanced or not
        CurlyCheckerIO_helper.display(s2, stack, test);

    }

  
}
