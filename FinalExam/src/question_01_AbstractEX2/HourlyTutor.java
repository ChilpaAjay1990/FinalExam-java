/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_01_AbstractEX2;

/**
 *
 * @author Ajay Chilpa
 */
class HourlyTutor extends Tutor {

    @Override
    void salary() {
        System.out.println("hourly salary of Tutor is 10.00$");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Solution for Question-01 : Ajay Chilpa");
        Tutor obj = new HourlyTutor();
        obj.salary();
    }

}
