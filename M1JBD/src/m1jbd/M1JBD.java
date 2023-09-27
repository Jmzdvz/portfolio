
package m1jbd;


public class M1JBD {

   
    public static void main(String[] args) 
    { 
      float q1, q2, qave, quiz, value, mp1, mp1a,mp2,mp2a,cs,pre,prep,fpg;
      
      System.out.println("Grading System");
      System.out.println("By: Jomari Basila Divinagracia");
      
      System.out.print("ENTER Q1:");
      q1= TextIO.getFloat();
      
      System.out.print("Enter Q2:");
      q2= TextIO.getFloat();
      qave= (q1+q2)/2;
      System.out.print("QAVE:");
      System.out.println(qave);
      
      
      quiz = (float) (qave*(0.25));
      System.out.print("Quiz25% : ");
      System.out.println(quiz);
      
      System.out.print("Values : ");
      value= TextIO.getlnFloat();
      System.out.print("Values 10% :");
      value = (float) (value*(0.10));
      System.out.println(value);
      
      System.out.print("Enter MP1 :");
      mp1= TextIO.getlnInt();
      System.out.print("MP1 15% :");
      mp1a= (float) (mp1*0.15);
      System.out.println(mp1a);
      
      System.out.print("Enter MP2 :");
      mp2= TextIO.getFloat();
      System.out.print("MP2 15% :");
      mp2a= (float) (mp2*0.15);
      System.out.println(mp2a);
      
      System.out.print("Class Standing: ");
      cs= value+mp1a+mp2a;
      System.out.println(cs);
      
      System.out.print("Prelim Exam: ");
      pre= TextIO.getlnFloat();
      System.out.print("Prelim Exam 35% : ");
      prep= (float) (pre*0.35);
      System.out.println(prep);
      
      System.out.print("FINAL PRELIMINARY GRADE:   ");
      fpg= quiz+cs+prep;
      System.out.println(fpg);
      
      
      if (fpg <= 75) { 
           System.out.println("You Failed");
      } else if (fpg > 75) {
          System.out.println("You Passed");
      }
      

    }
      
      
}  
      
      
    
    

