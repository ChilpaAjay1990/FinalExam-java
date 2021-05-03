/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Ajay Chilpa
 */
public class CheckedException {
    
public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        //throw exception FileNotfound Exception
		Scanner file = new Scanner(new File("MyFile.txt"));
                System.out.println("Solution for Question-06 Checked Exception : Ajay Chilpa");
                System.out.println(file);
    }   
}
