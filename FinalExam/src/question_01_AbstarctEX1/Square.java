/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_01_AbstarctEX1;

/**
 * This is a Square Class
 *
 * @author Ajay Chilpa
 */
public class Square extends GeomentricShapes {

    @Override
    public double getArea(double side) {
        return side * side;
    }
}
