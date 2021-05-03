/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_09;

/**
 *
 * @author Ajay Chilpa
 */
public class ThrowEx1 {

    static void time(float submission) {
        if (submission > 6) {
            throw new ArithmeticException("Submission not Successfull");
        } else {
            System.out.println("Submission is Successfull!");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        time(7);
    }

}
