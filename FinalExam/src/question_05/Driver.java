/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_05;

/**
 *
 * @author Ajay Chilpa
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Solution for Question-05 : Ajay Chilpa");
        ComparableCircle c1 = new ComparableCircle(22);
        ComparableCircle c2 = new ComparableCircle(25);
        int result = c1.compareTo(c2);
        if (result == 1) {
            System.out.println("c1 is bigger than c2");
        } else {
            System.out.println("c2 is bigger than c1");
        }

    }

}
