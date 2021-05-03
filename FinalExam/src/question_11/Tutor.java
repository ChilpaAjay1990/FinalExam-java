/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_11;

import java.util.Objects;

/**
 *
 * @author Ajay Chilpa
 */
public class Tutor {

    private String Name;
    private int id;

    public Tutor(String Name, int id) {
        this.Name = Name;
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Tutor{" + "Name=" + Name + ", id=" + id + '}';
    }

    @Override
    public int hashCode() {
        //hashCode method will returns hascode values of a class based upon the instance variables value.
        //This method is also used to compare different object of same class type based upon their instance variable value.
        //hascode value of two classes will only be equal if all instance variable values of one class is equal to all the instance variable values  of comparing object.
        int hash = 3;
        ////Because model attribute is string it generates a hashcode to it and add to hash value..
        hash = 11 * hash + Objects.hashCode(this.Name);
        hash = 11 * hash + this.id;
        //After hash value of complete class.
        return hash;
    }

    @Override
    ////Here I have declared equals method which is used to compares parameter passed object with calling object and compares based upon all the instance variable t1,t3 both the classes.
    //since Object obj is super class for all the classes we can declare it in parameter where passed instance implicity converted into Object type.
    //equals method return boolean value True,if every instance attribute value are equal in both the instances.
    public boolean equals(Object obj) {
        // checking if both the object references  are referring to the same object or not.
        if (this == obj) {
            return true;
            // It will check if the argument is of the type Tutor by comparing the classes of the passed argument and this object.
        }
        if (obj == null) {
            return false;
        }
        //comparing class cast if both the classes cast is different then we can also say both the classes are different so it will return false.
        if (getClass() != obj.getClass()) {
            return false;
        }
        //converting obj variable to Tutor class which is example of down casting.
        final Tutor other = (Tutor) obj;
        //comparing first instance attribute of both the objects if it is not equal it will return false.
        if (this.id != other.id) {
            return false;
        }
        //comparing second instance attribute varibale model of both the objects if it is not equal it will return false.

        if (!Objects.equals(this.Name, other.Name)) {
            return false;
        }
        //this step will excetute only after all the instance variable are equals then it will returns true.
        return true;
    }

}
