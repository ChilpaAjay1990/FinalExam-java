/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_02;

/**
 *
 * @author Ajay Chilpa
 */
abstract class GeometricObject {

    private double area;

    public double getArea() {
        return area;
    }

    GeometricObject(double area) {
        this.area = area;
    }

    public void howToColor() {
        System.out.println("In GeometricObject");
    }
}
