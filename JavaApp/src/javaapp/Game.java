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
int player1 = 0; 
int player2 = 0;


    public int getGamemode() {
        return gamemode;
    }

    private Player[] allPlayers;
    private int score[] = new int[2];
    
    
    public void playGame(){
        
        while(userOption != 3){
            Scanner s = new Scanner(System.in);
            System.out.println("Please choose who won the frame: " + "\n" + "1 = " + allPlayers[0].getName() + "\n" + "2 = " + allPlayers[1].getName()  + "\n" + "3 = Exit Game");
            
            userOption = s.nextInt();
            
            switch(userOption){
                
		case 1:{
			System.out.println(allPlayers[0].getName() + " Won the frame");
                        player1 = player1 + 1;
                        System.out.println(player1);
                        score[0] = player1;
			break;
		}
		case 2:{
			System.out.println(allPlayers[1].getName() + " Won the frame");
                        player2 = player2 + 1;
                        System.out.println(player2);
                        score[1] = player2;
			break;
		}
		case 3:{
			System.out.println("Game Ended");
                        finalScore();
			break;
        }
        }
        }
    }
    
    public void finalScore(){
         for (int i = 0; i < allPlayers.length; i ++){
            allPlayers[i].setFramesWon(score[i]);
            System.out.println(allPlayers[i].getFramesWon() + " Frames won by " + allPlayers[i].getName());
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
            allPlayers[i] = new Player();
            allPlayers[i].setName(s.nextLine());
            System.out.println(allPlayers[i].getName());

        }
}
}
