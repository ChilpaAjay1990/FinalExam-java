/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_01_InterfaceEx2;

/**
 *
 * @author Ajay Chilpa
 */
public class Aircraft implements Plane, Fly {

    @Override
    public void isCommercial() {
        System.out.println("Aircraft is a Business plane");
    }

    @Override
    public void isFlying() {
        System.out.println("Aircraft ia currently used for Commutes");
    }

}
