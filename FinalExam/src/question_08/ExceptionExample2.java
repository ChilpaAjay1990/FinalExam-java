/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_08;

/**
 *
 * @author Ajay Chilpa
 */
public class ExceptionExample2 {

    public static void main(String args[]) {
        try {
            int b = 0;
            int num = 99 / b;
        } catch (ArithmeticException ex) {
            System.out.print(ex);
        }
    }
}
