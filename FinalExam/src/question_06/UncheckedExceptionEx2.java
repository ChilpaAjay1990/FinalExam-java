/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_06;

/**
 *
 * @author Ajay Chilpa
 */
public class UncheckedExceptionEx2 {

    /* Below method does not have throws keyword
    and try-catch block , but it will compile */
    public static void main(String[] args) {
        int num1 = 100;
        int zero = 0;
        /* Dividing any number by 0 
         will give Arithmetic Exception*/
        int output = num1 / zero;
        System.out.println("Output : " + output);
    }
}
