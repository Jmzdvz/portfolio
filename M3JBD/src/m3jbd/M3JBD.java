
package m3jbd;

import java.util.Scanner;
public class M3JBD 
{ 
   public static void main(String[] args) 
   {
      Scanner scan = new Scanner(System.in);  
      
      System.out.println("Enter number of times to guess:");
      int max = scan.nextInt();
      
      int guessnum = (int) (Math.random()* 100 + 1);
      int answernum = 0;
      
      System.out.println("Guess Number from 1-100");
      int count = 1;
      while (guessnum != answernum)
      { System.out.println("Guess[" + count + "] :");
        answernum = scan.nextInt();
        if (count >= 10) 
        System.out.println("You Lose");
      }
      answernum = scan.nextInt();
      if (answernum > guessnum)
      {
          System.out.println("Lower");
      } else if (answernum < guessnum)
      {
          System.out.println("Higher");
      } else if (answernum == guessnum)
      {
          System.out.println("Correct");
      }
      if (count >= max){
          answernum = guessnum;
          System.out.println("Loser the correct asnwer is:" +answernum);
      }
    count++;    
    } 
}
