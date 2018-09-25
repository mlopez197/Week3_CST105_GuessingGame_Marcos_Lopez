/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author marcosalopez
 */
public class Exercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random rand = new Random();
        int numberToGuess = rand.nextInt(1000);
        int numberOfTries = 0;
        int count = 0;
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;
        
        while (win == false) {
        
            System.out.println("Guess a number between 1 and 1000: ");
            guess = input.nextInt();
            numberOfTries++;

            if (guess == numberToGuess); {
                    win = true;
            }
            if (guess < numberToGuess) {
                    System.out.println("Your guess is too low");
            }
            if (guess > numberToGuess)  {
                    System.out.println("Your guess is too high"); {   
            }
    
        }
        System.out.println("The number was " + numberToGuess );
        System.out.println("It took you " + numberOfTries + " tries");
        
            }
    }
}
        
    

    