/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

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
        if(gamemode == 1){
            allPlayers = new Player[2];
        }
    }
    
    
    
}
