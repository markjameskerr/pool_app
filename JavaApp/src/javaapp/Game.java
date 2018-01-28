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
public class Game {

private int gamemode;
    /**
     * @return the gamemode
     */
    public int getGamemode() {
        return gamemode;
    }

    /**
     * @param gamemode the gamemode to set
     */
    
    
    private Player[] allPlayers;
    
    
    
    public Game(int gamemode){
        
        this.gamemode = gamemode;
        Scanner s = new Scanner(System.in);
        
        if(gamemode == 1){
            allPlayers = new Player[2];
        }
        
        for (int i = 0; i < allPlayers.length; i ++)
        {
            System.out.println("Please enter your name: ");
            allPlayers[i] = new Player();
            allPlayers[i].setName(s.nextLine());
            System.out.println(allPlayers[i].getName());
        }
        
        
        
        

}
}
