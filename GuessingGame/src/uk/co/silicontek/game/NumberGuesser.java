/*#########################################################################
##                                                                       ##
##  #######     ####     ######   ########     ##     ####     ##   ###  ##
##  ##    ##   ##  ##   ##    ##  ##         ####    ##  ##    ##  ##    ##
##  ##    ##  ##    ##  ##        ##           ##   ##    ##   ## ##     ##
##  ##   ###  ##    ##  ##        ##           ##   ##    ##   ####      ##
##  #######   ########  ##  ####  #######      ##   ## ## ##   ##        ##
##  ##   ##   ##    ##  ##    ##  ##           ##   ##    ##   #####     ##
##  ##    ##  ##    ##  ##    ##  ##           ##   ##    ##   ## ##     ##
##  ##    ##  ##    ##  ##    ##  ##           ##    ##  ##    ##  ##    ##
##  ##    ##  ##    ##   ######   ########    ####    ####     ##   ###  ##
##                                                                       ##
##  Date :    27.05.17                                                   ##
##  Event :   practice                                                   ##
##  Author :  n/a                                                        ##
##  Email :   rage10@hotmail.co.uk                      	         ##
##  Version : n/a                                                        ##
##  Source :  Java 1.8                                                   ## 
#########################################################################*/
package uk.co.silicontek.game;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author emmanuelr
 */
public class NumberGuesser{
    
    public static int number, guess, maxNumber;
    public static Scanner scan;
    public static Random rand;
    
    public static void main(String[] args){
    
        scan = new Scanner(System.in);
        rand = new Random();
        number = rand.nextInt(101);
        
        System.out.print("Enter the number range you want to play: ");
        
        maxNumber = scan.nextInt();
        number = rand.nextInt(maxNumber);
        
        System.out.print("Please enter a guess: ");
                        
        while (guess != number){
            guess = scan.nextInt();
        
                if (guess > number ){
                    System.out.println("Your guess is too high: " + "/n");
                }
                
                if (guess < number){
                    System.out.println("Your guess is too low: " + "/n");    
                }        
        }
        System.out.print("You win");
    }
}
