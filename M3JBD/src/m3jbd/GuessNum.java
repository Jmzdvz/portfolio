/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m3jbd;

public class GuessNum {

    private int guessnumber;

    public GuessNum() {
        guessnumber = 1;

    }

    public int getGuessNumber() {
        return guessnumber;
    }

    public void SetGuessNumber() {
        guessnumber = (int) (Math.random() * 100 + 1);
    }

   // void resetGuessNumber() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.///
   //}////
}
