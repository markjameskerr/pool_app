/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

import java.util.ArrayList;
import java.util.List;
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

    //private Player[] allPlayers;
    //private int score[] = new int[2];
    List <Player> allPlayers = new ArrayList <>();
    
        public Game(int gamemode){
            
        
        this.gamemode = gamemode;
        Scanner s = new Scanner(System.in);
        
        if(gamemode == 1){
           
        }
        else if(gamemode == 2){
            
        }
        
        for (int i = 0; i < 2; i ++)
        {
            System.out.println("Please enter your name: ");
            //allPlayers[i] = new Player(); // array storing instances of Player class
            Player player = new Player();
            player.setName(s.nextLine());
            allPlayers.add(i, player);
            System.out.println(allPlayers.get(i).getName());
        }
}
       
    public void setupGame(){
            
    }
    
    
    public void playGame(){
        
        while(userOption != 3){
            Scanner s = new Scanner(System.in);
            System.out.println("Please choose who won the frame: " + "\n" + "1 = " + allPlayers.get(0).getName() + "\n" + "2 = " + allPlayers.get(1).getName()  + "\n" + "3 = Exit Game");
            
            userOption = s.nextInt();
            
            switch(userOption){
                
		case 1:{
			System.out.println(allPlayers.get(0).getName() + " Won the frame");
                        player1 = player1 + 1;
                        System.out.println(player1);
                        allPlayers.get(0).setFramesWon(player1);
                        //score[0] = player1;
			break;
		}
		case 2:{
			System.out.println(allPlayers.get(1).getName() + " Won the frame");
                        player2 = player2 + 1;
                        System.out.println(player2);
                        allPlayers.get(1).setFramesWon(player2);
                        //score[1] = player2;
			break;
		}
		case 3:{
			System.out.println("Game Ended");
                        System.out.println(allPlayers.get(0).getFramesWon() + " Frame(s) won by " + allPlayers.get(0).getName());
                        System.out.println(allPlayers.get(1).getFramesWon() + " Frame(s) won by " + allPlayers.get(1).getName());
			break;
                        }
                
                default: {
                        System.out.println("Please try again this is not valid option");
                        break;
                }
                
        }
        }
        }
    
    

}
