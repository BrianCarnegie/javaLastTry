/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp2;

import java.util.Scanner;

/**
 *
 * @author bcc14
 */
public class JavaApp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        
        System.out.print("Enter in a number and we will multiply it by 2 >> ");
        number = input.nextInt();
        
        int solution = number * 2;
        System.out.println("The answer is " + solution);
        System.out.println("hi");
    }
    
}
