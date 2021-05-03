/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_11;

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
        System.out.println("Solution for Question-11 : Ajay Chilpa");
        Tutor t1 = new Tutor("Joseph", 1);
        Tutor t2 = new Tutor("Hussain", 2);
        Tutor t3 = new Tutor("Joseph", 1);

        System.out.println("***** equals method is implemented *******");
        //here comparing the different Tutor class objects based upon their instance values.
        //The output will ne a True or False.
        //In equals method all the instance variables of one object withrespect to instance of another class,if both are equals then it returns true otherwise returns false.
        System.out.println(t1.equals(t2));
        System.out.println(t1.equals(t3));
        System.out.println(t2.equals(t3));

        System.out.println("***** == is imaplemented *******");
        // here comapring different objects based upon the reference location.
        // == for any object it compares reference location.
        // If any two objects variable refers to same location then it return true otherwise false.
        System.out.println(t1 == t2);
        System.out.println(t1 == t3);
        System.out.println(t2 == t3);

        System.out.println("***** hashcode method is implemented *******");
        //Here Comparing the hashcode values of all variables 
        //Here t1.t3 object hash code values as same because hash code of a object on instance variable value where t1,t4 as same instance variable values
        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());
        System.out.println(t3.hashCode());

        System.out.println("***** hashcode comparing  t1 and t3 instance objects*********");
        //Here it should return true because t1,t3 has same instance variable values and hash code is generated based upon the them. so object hashcode should be same.
        System.out.println(t1.hashCode() == t3.hashCode());

    }

}
