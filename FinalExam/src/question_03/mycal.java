/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_03;

/**
 *
 * @author Ajay Chilpa
 */
public class mycal extends cal {

    @Override
    void add(int x, int y) {
        int c = x + y;
        System.out.println("The addition is " + (c + x + y));
    }

    public static void main(String args[]) {
        System.out.println("Solution for Question-03 : Ajay Chilpa");
        cal c = new cal();
        mycal d = new mycal();
        c.add(10, 5);
        d.add(5, 6);
        cal c1 = (cal) d;//Upcasting as we are Converting a subclass type to a superclass type
        c1.add(10, 8);
        //DOWNCASTING as we are  Converting a superclass type to a subclass type
        cal d1 = new mycal();
        mycal d2 = (mycal) d1;
        d2.add(4, 3);
    }
}
