/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.pkg2;

import java.util.Scanner;
public class Test2 
{

    
    public static void main(String[] args) 
    {
        int numberOfDie;
        int numberOfBounces;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please input the number of Dice you want to throw.");
        numberOfDie = scan.nextInt();
        
        System.out.println("The Number Rolled is " + Dice.Throw(numberOfDie));
    }
    
}
