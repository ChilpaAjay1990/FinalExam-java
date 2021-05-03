/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_01_InterfaceEx1;

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
        System.out.println("Solution for Question-01 : Ajay Chilpa");
        Site site = (Site) new Ruby();
        site.codinglanguage();

        Site site2 = (Site) new Java();
        site2.codinglanguage();
    }

}
