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
int userOption = -1;
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
    
    public void playGame(){
        
        while(userOption != 3){
            Scanner s = new Scanner(System.in);
            System.out.println("Please choose who won the frame: " + "\n" + "0 = " + allPlayers[0].getName() + "\n" + "1 = " + allPlayers[1].getName()  + "\n" + "3 = Exit Game");
            
            userOption = s.nextInt();
            
            switch(userOption){
		case 0:{
			System.out.println(allPlayers[userOption].getName() + " Won the frame");
			break;
		}
		case 1:{
			System.out.println(allPlayers[userOption].getName() + " Won the frame");
			break;
		}
		case 3:{
			System.out.println("Exit Game");
			break;
        }
        }
        }
    }
    
    
    public Game(int gamemode){
        
        this.gamemode = gamemode;
        Scanner s = new Scanner(System.in);
        
        if(gamemode == 1){
            allPlayers = new Player[2];
        }
        
        for (int i = 0; i < allPlayers.length; i ++)
        {
            System.out.println("Please enter your name: ");
           // allPlayers[i] = new Player();
            allPlayers[i].setName(s.nextLine());
            System.out.println(allPlayers[i].getName());
        }
        
}
}
