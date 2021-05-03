/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_07;

import java.util.Scanner;

/**
 *
 * @author Ajay Chilpa
 */
public class Random {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Solution for Question-07 : Ajay Chilpa");
        int a[] = new int[100];
        int i, ij;
        for (i = 0; i < 100; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        try {
            System.out.println("Enter a number");
            ij = sc.nextInt();
            System.out.println(a[ij]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of bond");
        }
    }
}
