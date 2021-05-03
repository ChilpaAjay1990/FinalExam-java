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
public class CheckedExceptionEX2 {

    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner scan;

        scan = new Scanner(new File("file.txt"));
        while (scan.hasNext()) {
            int a = scan.nextInt();
            System.out.println(a);
        }

    }

}
