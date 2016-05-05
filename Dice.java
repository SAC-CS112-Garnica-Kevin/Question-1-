/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.pkg2;

/**
 *
 * @author Kevin
 */
import java.util.Random;
public class Dice 
{
        private static int dieNumbers; 
        private static int lowestValue = 1;
        private static int highestValue = 6;
    
  
	public static int Throw(int dices)
	{
            dieNumbers = dices;
            lowestValue = lowestValue * dieNumbers;
            highestValue = highestValue * dieNumbers;
            Random rand = new Random();
            int diceValue = lowestValue + (int)(Math.random() * ((highestValue - lowestValue) + 1));
            return diceValue;
	}
}
