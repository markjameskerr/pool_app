/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;
import java.util.Scanner;
/**
 *
 * @author markk
 */
public class JavaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int gamemode = 0;
        Scanner s = new Scanner(System.in);
        
        while (gamemode != -1) {
            
            System.out.println("Please enter which game mode you want to play? ");
            System.out.println("Please use the following 1. Head to Head mode" + "\n" + "typing -1 will exit the application");
            gamemode = s.nextInt();
            
            if (gamemode != -1){
                Game game = new Game(gamemode);
                game.playGame();
            }
            
            
            
        }
        
        
        System.out.println("Thanks for playing the game");
 
    }
    
}
