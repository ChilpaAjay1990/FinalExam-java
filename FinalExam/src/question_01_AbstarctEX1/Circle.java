/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_01_AbstarctEX1;

/**
 * This is a Circle class
 *
 * @author Ajay Chilpa
 */
public class Circle extends GeomentricShapes {

    static final double PI = 3.14;

    @Override
    public double getArea(double radius) {
        return radius * radius * PI;
    }
}
